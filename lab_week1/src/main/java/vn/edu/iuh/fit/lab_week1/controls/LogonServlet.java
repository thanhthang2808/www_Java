package vn.edu.iuh.fit.lab_week1.controls;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.iuh.fit.lab_week1.HelloServlet;
import vn.edu.iuh.fit.lab_week1.daos.UserDAO;
import vn.edu.iuh.fit.lab_week1.models.User;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/logon"})
public class LogonServlet extends HelloServlet {
    private UserDAO dao;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String usn = req.getParameter("username");
        String pwd = req.getParameter("password");
//        boolean kq = dao.logon(usn, pwd);
        ArrayList<User> list = (ArrayList<User>) session.getAttribute("ds");
    }
}
