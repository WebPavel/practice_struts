package action.usr.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.usr.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    public String list() {
        user.setUsername("鲁迅");
        user.setProfile("我没说过这句话！");
        user.setVipRank(0);
        return SUCCESS;
    }



//    private List<User> users;
//
//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
//
//    public String list() {
//        users = new ArrayList<>();
//        User userItem = new User();
//        userItem.setUsername("tom");
//        userItem.setProfile("一只猫");
//        userItem.setVipRank(1);
//        users.add(userItem);
//        User userItem1 = new User();
//        userItem1.setUsername("cat");
//        userItem1.setProfile("一只老鼠");
//        userItem1.setVipRank(0);
//        users.add(userItem1);
//        return SUCCESS;
//    }
}
