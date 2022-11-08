package controller;

import dao.CRUD_Account;
import dao.CRUD_Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/delete_product")
public class Delete_Product_Severlet extends HttpServlet {
    CRUD_Product crud_product = new CRUD_Product();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        crud_product.delete(id);
        resp.sendRedirect("/product");
    }
}
