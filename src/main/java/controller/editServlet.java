package controller;

import dao.CRUD_Account;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/edit")
public class editServlet extends HttpServlet {
    List<Account> listAccount = CRUD_Account.get_All_Acc();

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
//        CRUD_Account.getAccountbyID(id);
//        req.setAttribute("account",listAccount);
//       RequestDispatcher dispatcher=  req.getRequestDispatcher("edit.jsp");
//       dispatcher.forward(req,resp);
////        resp.sendRedirect("edit.jsp");
//
//    }
    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        int role = Integer.parseInt(req.getParameter("role"));
        CRUD_Account.edit(id, new Account(id, username, password, role));
      resp.sendRedirect("/account");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Account account = null;
        for (Account ac:listAccount) {
            if (ac.getId() == id){
                account = ac;
            }
        }
        req.setAttribute("account", account);
        RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
        dispatcher.forward(req, resp);
    }
}
