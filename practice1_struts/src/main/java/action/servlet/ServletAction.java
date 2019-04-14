package action.servlet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class ServletAction extends ActionSupport {
    @Override
    public String execute() {
        ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> applicationMap = actionContext.getApplication();
        Map<String, Object> parameterMap = actionContext.getParameters();
        Map<String, Object> sessionMap = actionContext.getSession();
        System.out.println(applicationMap.get("aname"));
        System.out.println(((String[]) parameterMap.get("ref"))[0]);
        System.out.println(sessionMap);
        actionContext.put("user.username", "jk");
        actionContext.put("user.nickname", "whiteSilk");
        System.out.println(actionContext.get("user.username"));
        return SUCCESS;
    }
}
