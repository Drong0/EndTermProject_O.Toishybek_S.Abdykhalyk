package com.company.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL= "jdbc:postgresql://127.0.0.1:54324/store";
        try{
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(connectionURL,"postgres", "olzhas200323");
            return con;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
