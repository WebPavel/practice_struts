package action.impl;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("HelloAction impl execute do.");
//        return "success";
        return SUCCESS;
    }
}
