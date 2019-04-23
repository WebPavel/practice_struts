package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import entity.usr.user.User;
import org.apache.struts2.ServletActionContext;

//public class PermissionInterceptor implements Interceptor {
//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void init() {
//
//    }

public class PermissionInterceptor extends MethodFilterInterceptor {
    @Override
    public String doIntercept(ActionInvocation invocation) throws Exception {
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
        if (user == null) {
            ActionSupport actionSupport = (ActionSupport) invocation.getAction();
            actionSupport.addActionError("当前用户未登录，请先登录！");
            return Action.LOGIN;
        } else {
            return invocation.invoke();
        }
    }
}
