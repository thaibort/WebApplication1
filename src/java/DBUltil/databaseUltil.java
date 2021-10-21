/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUltil;

import java.sql.*;

/**
 *
 * @author thaibort
 */
public class databaseUltil {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhos/test","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
