package com.QSJ.filter;

import com.QSJ.entity.User;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Package: com.QSJ.filter
 * @ClassName: UserFilter
 * @Author: SamSung
 * @CreateTime: 2020-10-04 20:03
 * @Description:
 */
@Component
@WebFilter(urlPatterns = {"/index.html"} , filterName = "userFilter")
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;
        HttpSession session = request1.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null){
            response1.sendRedirect("login.html");
        }else {
            chain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
