package controller;

import dao.CRUD_Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class ProductServlet_Admin extends HttpServlet {
    CRUD_Product products = new CRUD_Product();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setAttribute("product",products.getALL_Product());
        RequestDispatcher dispatcher = req.getRequestDispatcher("showProduct.jsp");
        dispatcher.forward(req,resp);
    }
}
