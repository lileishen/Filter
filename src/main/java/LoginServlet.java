import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author nono
 * @Package PACKAGE_NAME
 * @ClassName LoginServlet.java
 * @Description TODO
 * @createTime 2020年08月16日 09:17:00
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("登录业务");
        String username =req.getParameter("username");
         String password =req.getParameter("password");
          resp.setContentType("text/html;charset=utf-8");
         if ("username".equals(username)&&"123456".equals(password)){
             req.getSession().setAttribute("username",username);
             resp.sendRedirect("/admin/a.jsp");
         }else{
             req.getRequestDispatcher("/login.jsp").forward(req,resp);
         }



    }
}
