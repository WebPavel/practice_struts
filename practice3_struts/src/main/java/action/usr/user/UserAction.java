package action.usr.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.usr.user.User;
import utils.StringUtils;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    public String register() {
        System.out.println("register ..");
        return SUCCESS;
    }
    public String login() {
        System.out.println("login ..");
        return SUCCESS;
    }

//    @Override
//    public void validate() {
//        if (StringUtils.empty(user.getUsername())) {
//            this.addFieldError("username.message", "用户名不能为空");
//        }
//        if (StringUtils.empty(user.getPassword())) {
//            this.addFieldError("password.message", "密码不能为空");
//        }
//        System.out.println("validate ..");
//    }
//    public void validateRegister() {
//        if (!(user.getAge() > 10 && user.getAge() < 40)) {
//            this.addFieldError("age.message", "年龄必须在10-40之间");
//        }
//        System.out.println("validate register ..");
//    }

    @Override
    public User getModel() {
        return user;
    }
}
