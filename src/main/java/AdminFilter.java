import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author nono
 * @Package PACKAGE_NAME
 * @ClassName AdminFilter.java
 * @Description TODO
 * @createTime 2020年08月16日 08:50:00
 */
public class AdminFilter implements Filter {

    public AdminFilter() {
        System.out.println("构造器方法执行了");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化方法执行了");
        //1.获取过滤器名称
        String filterName = filterConfig.getFilterName();
        System.out.println("过滤器名称"+filterName);
        //2.获取初始化参数
        String username = filterConfig.getInitParameter("username");
        System.out.println("username"+username);
        //3.获取ServletContext对象
        filterConfig.getServletContext();


    }

    /**
     * 专门用于拦截请求，可以做权限检查
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter方法执行了");

        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        HttpSession session =httpServletRequest.getSession();
        if (session.getAttribute("username")==null){
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
            return;
        }else{
            //让程序继续往下访问用户的目标资源
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {
        System.out.println("销毁方法执行了");
    }
}
