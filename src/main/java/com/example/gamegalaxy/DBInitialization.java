package com.example.gamegalaxy;

import javafx.geometry.Pos;

import java.sql.*;

public class DBInitialization {
    public Connection conn;
    public void createUserInfoTable()
    {
        PostgreConnection pc=new PostgreConnection();
        pc.createPSQLConnection();
        conn= pc.conn;
        try
        {
            String sql="create table userInfo(firstName varchar(20),secondName varchar(20), age int,username varchar(20),emailID varchar(30) unique,password varchar(20), primary key(username))";
            Statement stmt= conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createGameTable()
    {
        PostgreConnection pc=new PostgreConnection();
        pc.createPSQLConnection();
        conn= pc.conn;
        try
        {
            String sql="create table game \n" +
                    "(\n" +
                    "\ttitle varchar(20),\n" +
                    "\tsynopsis varchar(500),\n" +
                    "\treleaseDate date,\n" +
                    "\tplatform text[],\n" +
                    "\tgenre text[],\n" +
                    "\tdeveloper varchar(20),\n" +
                    "\tpublisher varchar(20),\n" +
                    "\tconstraint pk_game primary key(title)\n" +
                    ");";
            Statement stmt= conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertValues()
    {
        PostgreConnection pc=new PostgreConnection();
        pc.createPSQLConnection();
        conn= pc.conn;
        try
        {
            PreparedStatement pstmt=conn.prepareStatement("insert into userInfo values(?,?,?,?,?,?)");
            pstmt.setString(1,"Saqif");
            pstmt.setString(2,"Kaisar");
            pstmt.setInt(3,21);
            pstmt.setString(4,"Kaizer");
            pstmt.setString(5,"kaizer@gmail.com");
            pstmt.setString(6,"ab21");
            pstmt.executeUpdate();
            pstmt.setString(1,"Sazeed");
            pstmt.setString(2,"Anwar");
            pstmt.setInt(3,26);
            pstmt.setString(4,"Saz");
            pstmt.setString(5,"saz@gmail.com");
            pstmt.setString(6,"ab26");
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
