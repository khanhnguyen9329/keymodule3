package controller;

import dao.CRUD_Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/product_user")
public class ProductServlet_User extends HttpServlet {
    CRUD_Product products = new CRUD_Product();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("product_user",products.getALL_Product());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/show_Product_User.jsp");
        dispatcher.forward(req,resp);
    }
}
