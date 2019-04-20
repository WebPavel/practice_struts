package action.ajax;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class AjaxAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("AjaxAction execute..");
        System.out.println(name);
        ServletActionContext.getResponse().getWriter().write("hello," + name);
        return null;
    }
}
