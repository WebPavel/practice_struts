package action.usr.user;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;
import entity.usr.user.User;
import exception.usr.user.LoginException;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import service.usr.user.UserService;
import utils.FileDownloadUtils;
import utils.FileUploadUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    private List<User> users;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String update() throws Exception {
        UserService userService = new UserService();
        if (upload != null) {
            String uuidFileName = FileUploadUtils.getUUIDFileName(uploadFileName);
            File destFile = new File("/upload/usr/user" + uuidFileName);
            FileUtils.copyFile(upload, destFile);
            user.setPath(destFile.getCanonicalPath());
            user.setFilename(uploadFileName);
        }
        try {
            userService.update(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "update_success";
    }

    /**
     * 改之前查询
     * @return
     */
    public String findOfSelected() throws Exception {
        UserService userService = new UserService();
        try {
            // 查询用户
            user = userService.findById(user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "findOfSelected_success";
    }
    public String download() throws Exception {
        UserService userService = new UserService();
        try {
            // 查询用户
            user = userService.findById(user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "download_success";
    }

    public String getContentType() {
        String ret = ServletActionContext.getServletContext().getMimeType(user.getFilename());
        System.out.println(ret);
        return ret;
    }

    public String getFileName() throws Exception {
        String userAgent = ServletActionContext.getRequest().getHeader("user-agent");
        String ret = FileDownloadUtils.getDownloadFileName(userAgent, user.getFilename());
        System.out.println("downloadFileName: "+ret);
        return ret;
    }

    public InputStream getInputStream() throws Exception {
        return new FileInputStream(new File(user.getPath()));
    }

    public String findById() throws Exception {
        UserService userService = new UserService();
        try {
            // 查询用户
            user = userService.findById(user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "findById_success";
    }

    public String del() throws Exception {
        UserService userService = new UserService();
        try {
            // 先查询用户，判断是否有简历，如果有先删除简历
            user = userService.findById(user.getId());
            String path = user.getPath();
            if (path != null) {
                // 删除简历
                new File(path).delete();
            }
            userService.delete(user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "del_success";
    }

    public String listByCond() throws Exception {
        System.out.println(user.getUsername()+","+user.getGender()+","+user.getEducation()+","+user.getIsUpload());
        UserService userService = new UserService();
        try {
            users = userService.findByCond(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "listByCond_success";
    }

    @InputConfig(resultName = "add_input")
    public String add() throws Exception {
        // 1.完成上传
        // 2.添加操作
        UserService userService = new UserService();
        if (upload != null) {
            String uuidFileName = FileUploadUtils.getUUIDFileName(uploadFileName);
            File destFile = new File("/upload/usr/user" + uuidFileName);
            FileUtils.copyFile(upload, destFile);
            user.setPath(destFile.getCanonicalPath());
            user.setFilename(uploadFileName);
        }
        try {
            userService.save(user);
        } catch (SQLException e) {
            e.printStackTrace();
            this.addActionError("添加失败");
            return Action.INPUT;
        }
        return "add_success";
    }

    public String list() throws Exception {
        UserService userService = new UserService();
        try {
            users = userService.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "list_success";
    }

    @InputConfig(resultName = "login_input")
    public String login() throws Exception {
        UserService userService = new UserService();
        try {
            user = userService.login(user);
            if (user == null) {
                this.addActionError("用户名或密码错误");
                return Action.LOGIN;
            }
            ServletActionContext.getRequest().getSession().setAttribute("user", user);
        } catch (LoginException e) {
            e.printStackTrace();
            this.addActionError("登录失败");
            return Action.LOGIN;
        }
        return "login_success";
    }

    @Override
    public User getModel() {
        return user;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
}
