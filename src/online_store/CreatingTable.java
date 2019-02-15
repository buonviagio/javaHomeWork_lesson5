package online_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import static online_store.ConnectionData.URL;
import static online_store.ConnectionData.USER;
import static online_store.ConnectionData.PASSWORD;

public class CreatingTable {
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE users1 "
                    + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                    + "username VARCHAR(50),"
                    + "PRIMARY KEY(id));";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement()){
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
