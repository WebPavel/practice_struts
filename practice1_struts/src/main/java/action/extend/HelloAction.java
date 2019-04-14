package action.extend;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("HelloAction extends execute do.");
//        return "success";
        return NONE; // 相当于return null;
    }
}
