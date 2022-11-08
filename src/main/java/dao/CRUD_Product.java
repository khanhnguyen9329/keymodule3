package dao;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Product {
   Connection connection = ConnectMySQL.getConnection();

    public  List<Product> getALL_Product() {
        String sql = "select * from  demo_login_module3.product";
        List<Product> productList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String img = resultSet.getString("img");
                double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("amount");
                productList.add(new Product(id, name, img, price, amount));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return productList;
    }
    public void delete(int id) {
        try {
            String sql = "delete from demo_login_module3.product where id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
