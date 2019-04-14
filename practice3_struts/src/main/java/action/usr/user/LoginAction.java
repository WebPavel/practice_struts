package action.usr.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.usr.user.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        if ("Admin".equalsIgnoreCase(user.getUsername()) && "123456".equals(user.getPassword())) {
            request.getSession().setAttribute("username", user.getUsername());
            return SUCCESS;
        } else {
            request.setAttribute("login.message", "用户名或密码错误");
            return "failed";
        }
    }
}
