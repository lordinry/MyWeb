package com.jie.control;

import com.jie.dao.AccountMapper;
import com.jie.pojo.Account;
import com.jie.utils.batisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String username =  req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        SqlSession sqlSession = batisUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = mapper.getAccountByName(username);
        try{
            String user = account.getUsername();
            String pass = account.getPassword();
            System.out.println(user);
            System.out.println(pass);
            if(username.equals(user)&&password.equals(pass)){
                req.setAttribute("username",username);
                req.getRequestDispatcher("welcome.jsp").forward(req,resp);
            }else{
                req.setAttribute("msg","登陆失败");
                req.getRequestDispatcher("index.jsp").forward(req,resp);
            }
        }catch (NullPointerException e){
            req.setAttribute("msg","登陆失败");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }



    }
}
