package servlet.usr.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String token = request.getParameter("token");
        String _token = (String) request.getSession().getAttribute("token");
        request.getSession().removeAttribute("token");
        if (token.equals(_token)) {
            System.out.println("username:" + username + ",password:" + password);
            System.out.println("operation database");
        } else {
            response.getWriter().write("请不要重复提交表单！");
            return;
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
