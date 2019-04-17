package interceptor;

import action.biz.album.AlbumAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import entity.usr.user.User;
import org.apache.struts2.ServletActionContext;

//public class PrivilegeInterceptor implements Interceptor {
//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void init() {
//        System.out.println("PrivilegeInterceptor init do..");
//    }
//
//    @Override
//    public String intercept(ActionInvocation invocation) throws Exception {
//        System.out.println("PrivilegeInterceptor intercept do..");
////        return null;
////        return invocation.invoke();
//        return Action.LOGIN;
//    }
//}

public class PrivilegeInterceptor extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        // 1.获取session用户对象
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
        if (user == null) {
            AlbumAction action = (AlbumAction) invocation.getAction();
            action.addActionError("权限不足，请先登录");
            return Action.LOGIN;
        }
        return invocation.invoke();
    }
}
