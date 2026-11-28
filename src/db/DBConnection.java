package db;
import java.sql.*;

public class DBConnection {
    //api to connect to the database
    private static final String URL="jdbc:mysql://localhost:3306/trademark_db";

    //username and password to connect to the database
    private static final String USER="root";
    private static final String PASS="root1234";

    //get connection to the database
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
}
