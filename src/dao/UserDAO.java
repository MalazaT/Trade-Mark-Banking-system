package dao;
import model.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;

public class UserDAO {
    
    //Register User
    public boolean registerUser(user user) throws SQLException {
       String sql= """
                INSERT INTO Users(first_name, last_name, phone, email, pin) VALUES(?,?,?,?,?)
                """;

        try (Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql)){

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getPin());

            return ps.executeUpdate()>0;
        }
    }

    //Login  User
    public user loginUser(String email, String pin) throws SQLException{
        String sql= """
                SELECT * FROM Users WHERE email=? AND pin=?
                """;
        
        try(Connection con= DBConnection.getConnection();
        PreparedStatement ps= con.prepareStatement(sql)){
            ps.setString(1, email);
            ps.setString(2,pin);
            

        ResultSet rs= ps.executeQuery();

        if(rs.next()){
            return new user(
                rs.getInt("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("pin")
            );
        }
    }
    return null;
    }

    // Get User by ID
    public user getUserbyID(int userId) throws SQLException{
        String sql="""
                SELECT * FROM Users WHERE user_id=?
                """;
                
        try (Connection con= DBConnection.getConnection();
        PreparedStatement ps= con.prepareStatement(sql)){
            ps.setInt(1,userId);
            
        ResultSet rs=ps.executeQuery();

        if(rs.next()){
            return new user(
                rs.getInt("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("pin")
            );
        }

    }
    return null;
}

// Get all users
public List<user> getAllUsers() throws SQLException{
    List<user> users= new ArrayList<>();

    String sql="""
            SELECT * FROM Users
            """;

    try(Connection con=DBConnection.getConnection();
       Statement stmt= con.createStatement();
       ResultSet rs= stmt.executeQuery(sql)){

        while(rs.next()){

            user User= new user(
                rs.getInt("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("pin")
            );
            users.add(User);
        }
       }
    return users;
}

//Check if Email exists
public boolean emailExists(String email) throws SQLException{
    String sql="""
            SELECT user_id FROM User WHERE email=?
            """;

    try (Connection con= DBConnection.getConnection();
       PreparedStatement ps= con.prepareStatement(sql)){
         ps.setString(1, email);

         ResultSet rs= ps.executeQuery();

         return rs.next();
       }
      
    }

}
