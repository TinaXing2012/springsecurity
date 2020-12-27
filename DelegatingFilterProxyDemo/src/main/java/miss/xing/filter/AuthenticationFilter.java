package miss.xing.filter;

import miss.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component("authenticationFilter")
public class AuthenticationFilter implements Filter {

    @Autowired
    UserService userService;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Authentication......");
        userService.findUser();
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
