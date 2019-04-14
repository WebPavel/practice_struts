package action.servlet;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class ServletAwareAction extends ActionSupport implements ServletRequestAware {

    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        System.out.println(requestURI);
        System.out.println(contextPath);
        System.out.println(request.getParameter("referer"));
        return null;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
