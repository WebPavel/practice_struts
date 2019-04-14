package action;

import entity.usr.User;
import i.ModelDriven;

public class HelloAction implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

//    private String username;
//    private String password;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

//    public String hello() {
//        System.out.println("HelloAction -> hello method do.");
//        System.out.println(username + "::" + password);
//        return "hello";
//    }

    public String hello() {
        System.out.println("HelloAction -> hello method do.");
        System.out.println(user.getUsername() + "::" + user.getPassword());
        return "hello";
    }
}
