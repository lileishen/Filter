import javax.servlet.*;
import java.io.IOException;

/**
 * @author nono
 * @Package PACKAGE_NAME
 * @ClassName Filter2.java
 * @Description TODO
 * @createTime 2020年08月16日 10:31:00
 */
public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2前置代码……");
       filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter2后置代码");
    }

    @Override
    public void destroy() {

    }
}
