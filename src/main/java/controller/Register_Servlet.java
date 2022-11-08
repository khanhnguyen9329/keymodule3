package controller;

import dao.register_DAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = "/Register_Servlet")
public class Register_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Register.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        String password1 = req.getParameter("pass1");
        String address = req.getParameter("address");
        Date birth = Date.valueOf(req.getParameter("birth"));
        int id_role = Integer.parseInt(req.getParameter("role"));

        if (password.equals(password1)) {
            boolean check = register_DAO.save(new Account(username, password, address, birth, id_role));
            if (check) {
              resp.sendRedirect("/login");
            } else {
                resp.sendRedirect("/Register_Servlet");
            }
        } else {
            String check = "Mật khẩu không giống nhau";
            req.setAttribute("check", check);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/Register.jsp");
            dispatcher.forward(req, resp);
        }

    }


}
