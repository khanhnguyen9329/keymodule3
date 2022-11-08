package dao;

import model.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Account {
    static Connection connection = ConnectMySQL.getConnection();

    public static List<Account> get_All_Acc() {
        String sql = "select * from demo_login_module3.account";
        List<Account> accounts = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                int id_role = resultSet.getInt("id_role");
                accounts.add(new Account(id, username, password, id_role));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return accounts;
    }

    public static void delete(int id) {
        try {
            String sql = "delete from demo_login_module3.account where id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


        public static void edit(int id, Account account) {
        try {
            String sql = "update demo_login_module3.account\n" +
                    "set username =?, password= ?, id_role =?\n" +
                    "where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,account.getUsername());
            preparedStatement.setString(2,account.getPassword());
            preparedStatement.setInt(3, account.getId_role());
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
        }
         catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static Account getAccountbyID(int id) {
//        try {
//            String sql = "select * from demo_login_module3.account where id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, id);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()){
//                return new Account
//                        (rs.getInt(1),
//                         rs.getString(2),
//                          rs.getString(3),
//                                rs.getInt(4));
//
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return null;
//    }
}
