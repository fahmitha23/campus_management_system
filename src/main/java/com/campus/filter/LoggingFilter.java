package com.campus.filter;
import jakarta.servlet.annotation.WebFilter;
public class LoggingFilter {





    import java.io.IOException;

    @WebFilter ("/*")
    public class LoggingFilter implements jakarta.servlet.Filter{

        @Override
        public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
                throws IOException,ServletException {
            System.out.println("Request received ");
            chain.doFilter(request, response);
            System.out.println("Response sent ");
        }
    }
}
