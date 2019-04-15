package action.usr.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.usr.user.User;
import utils.StringUtils;

import java.util.Arrays;

public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }
    @Override
    public String execute() throws Exception {
        System.out.println(user.getAge() + "\t" + user.getBirthday() + "\t" + Arrays.toString(user.getHobby()));
        return SUCCESS;
    }

    @Override
    public void validate() {
        String username = user.getUsername();
        if (StringUtils.empty(username)) {
            this.addFieldError("username.message", "用户名不能为空");
        }
        String password = user.getPassword();
        if (StringUtils.empty(password)) {
            this.addFieldError("password.message", "密码不能为空");
        }
        if (!(user.getAge() > 10 && user.getAge() < 40)) {
            this.addFieldError("age.message", "年龄必须在10-40之间");
        }
    }
}
