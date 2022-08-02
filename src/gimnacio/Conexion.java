/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnacio;
import java.sql.*;
import java.sql.Connection;
/**
 *
 * @author liooficial
 */
public class Conexion {
    public static Connection getConexion() {
        String connectionUrl ="jdbc:sqlserver://localhost:1433;databaseName=GYM1;integratedSecurity=true";
                //+"databaseName=GYM1;"+"user=sa"+"password=12345"+"loginTimeout=30";
                //"integratedSecurity=true";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("Driver funciona correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println("Error........:"+ex.toString());
             return null;
        }
        
    }

}
