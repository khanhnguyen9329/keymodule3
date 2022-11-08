package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;
import service.AccountService;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns ="/sear")
public class SearServlet extends HttpServlet {
AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //lấy dữ liệu từ ô input
        String name = req.getParameter("search");
        List<Product> productList = accountService.search(name);
        req.setAttribute("product_user", productList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/show_Product_User.jsp");
        dispatcher.forward(req, resp);

    }
}
