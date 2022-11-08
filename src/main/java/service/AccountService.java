package service;

import dao.CRUD_Account;
import dao.CRUD_Product;
import model.Account;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public static List<Account> accounts = CRUD_Account.get_All_Acc();

    CRUD_Product crud_product = new CRUD_Product();
    public List<Product> products = crud_product.getALL_Product();

    public static void add(Account account) {
        accounts.add(account);
    }

    public static void edit1(int id, Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.set(i, account);
            }
        }
    }

    public List<Product> search(String name) {
        List<Product> list = new ArrayList<>();
        for (Product sp : products) {
            if (sp.getName().contains(name)) {
                list.add(sp);
            }
        }
        return list;
    }
}


