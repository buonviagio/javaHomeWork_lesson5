package online_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static online_store.ConnectionData.PASSWORD;
import static online_store.ConnectionData.URL;
import static online_store.ConnectionData.USER;

public class RetrieveData {
    private static final String SELECT_QUERY =
            "SELECT * FROM goods";
    private static final String SELECT_BEACHHOLIDAYS =
            "SELECT * FROM category inner join goods on category.idGoods=goods.id WHERE category.nameOfCategory = 'beachHolidays';";
    private static final String SELECT_EXCURSION =
            "SELECT * FROM category inner join goods on category.idGoods=goods.id WHERE category.nameOfCategory = 'excursion';";
    private static final String SELECT_SKIVACATION =
            "SELECT * FROM category inner join goods on category.idGoods=goods.id WHERE category.nameOfCategory = 'skiVacation';";

    public List<Goods> getGoods() {
        List<Goods> arrayList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(SELECT_QUERY);
            while (result.next()) {
                String nameOfProduct = result.getString("nameOfProducts");
                int price = result.getInt("price");
                int reiting = result.getInt("reiting");
                arrayList.add(new Goods(nameOfProduct, price, reiting));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public List<Goods> getBeachHolidays() {
        List<Goods> arrayList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(SELECT_BEACHHOLIDAYS);
            while (result.next()) {
                String nameOfProduct = result.getString("nameOfProducts");
                int price = result.getInt("price");
                int reiting = result.getInt("reiting");
                arrayList.add(new Goods(nameOfProduct, price, reiting));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public List<Goods> getExcursion() {
        List<Goods> arrayList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(SELECT_EXCURSION);
            while (result.next()) {
                String nameOfProduct = result.getString("nameOfProducts");
                int price = result.getInt("price");
                int reiting = result.getInt("reiting");
                arrayList.add(new Goods(nameOfProduct, price, reiting));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public List<Goods> getSkiVakation() {
        List<Goods> arrayList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet result = statement.executeQuery(SELECT_SKIVACATION);
            while (result.next()) {
                String nameOfProduct = result.getString("nameOfProducts");
                int price = result.getInt("price");
                int reiting = result.getInt("reiting");
                arrayList.add(new Goods(nameOfProduct, price, reiting));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

}
