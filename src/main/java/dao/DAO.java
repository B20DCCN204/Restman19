package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	protected Connection connection;
    public DAO(){
        String dbClass = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/restman19?autoReconnect=true&useSSL=false";
        try {
                Class.forName(dbClass);
                connection = DriverManager.getConnection(url, "root", "giang412345");
        } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
}
