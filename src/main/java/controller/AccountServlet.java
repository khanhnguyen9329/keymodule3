package controller;

import dao.CRUD_Account;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.AccountService;

import java.io.IOException;

@WebServlet(urlPatterns = "/account")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setAttribute("accounts", CRUD_Account.get_All_Acc());
        RequestDispatcher dispatcher =req.getRequestDispatcher("/ShowAccount.jsp");
        dispatcher.forward(req,resp);
    }
}
