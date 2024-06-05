package com.example.gamegalaxy;

import java.sql.*;

public class PostgreConnection {
    public Connection conn;
    public void createPSQLConnection()
    {
        String url = "jdbc:postgresql://localhost:5432/GameGalaxy";
        String user="postgres";
        String pass="saqif21";
        try{
            conn=DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
