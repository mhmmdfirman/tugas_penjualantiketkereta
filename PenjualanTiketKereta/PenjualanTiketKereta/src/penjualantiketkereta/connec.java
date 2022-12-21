/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualantiketkereta;
import java.sql.*;


/**
 *
 * @author user
 */
public class connec {
    private static Connection con;
    
     public static Connection getKoneksi() {
        if (con == null) {
            try {
                Driver mysql = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(mysql);
                String jdbcUrl = "jdbc:mysql://localhost:3306/tiketkereta";
                String username = "root";
                String password = "";
                con = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("sukses connect");

            } catch (SQLException exception) {
                System.out.println(exception);
            }

        }

        return con;
}
    
}
