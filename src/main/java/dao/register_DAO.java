package dao;

import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class register_DAO {
    public static boolean save(Account register) {
        try {
            String sql = "insert into demo_login_module3.account(username,password,address,birthday,id_role)value(?,?,?,?,?)";
            Connection connection = ConnectMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, register.getUsername());
            preparedStatement.setString(2, register.getPassword());
            preparedStatement.setString(3,register.getAddress());
            preparedStatement.setDate(4,register.getBirthday());
            preparedStatement.setInt(5,register.getId_role());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
