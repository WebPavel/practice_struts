package action.usr.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.usr.user.User;
import org.apache.struts2.ServletActionContext;

public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    public String login() {
        if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            System.out.println("UserAction login success..");
            ServletActionContext.getRequest().getSession().setAttribute("user", user);
            return SUCCESS;
        } else {
            this.addActionError("用户名或密码错误");
            return INPUT;
        }
    }

    @Override
    public User getModel() {
        return user;
    }

}
