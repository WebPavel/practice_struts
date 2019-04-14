package web.filter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class ActionFilter implements Filter {

    private Document document;

    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String actionName = requestUri.substring(contextPath.length());
        System.out.println("request path:" + actionName);
        Element actionElement = (Element) document.selectSingleNode("//action[@name='"+actionName+"']");
        if (actionElement != null) {
            String className = actionElement.attributeValue("class");
            String methodName = actionElement.attributeValue("method");
            System.out.println("process class:" + className);
            System.out.println("process method:" + methodName);
            try {
                Class clazz = Class.forName(className);
                Method method = clazz.getDeclaredMethod(methodName);
                String returnValue = (String) method.invoke(clazz.newInstance());
                System.out.println("return value:" + returnValue);
                Element resultElement = actionElement.element("result");
                String nameValue = resultElement.attributeValue("name");
                if (returnValue.equals(nameValue)) {
                    String forwardPath = resultElement.getText();
                    System.out.println("forward path:" + forwardPath);
                    request.getRequestDispatcher(forwardPath).forward(request, response);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        chain.doFilter(req, resp);
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        SAXReader reader = new SAXReader();
        try {
            this.document = reader.read(new File(this.getClass().getResource("/action.xml").getPath()));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
