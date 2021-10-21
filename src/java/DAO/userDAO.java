/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUltil.databaseUltil;
import user.user;
import java.sql.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.jasper.tagplugins.jstl.core.Catch;

/**
 *
 * @author thaibort
 */

public class userDAO {
    public static List<user> getAll(){
        List<user> userList = new ArrayList<>();
        try{
            Connection con = databaseUltil.getConnection();
            Statement sta = con.createStatement();
            
            String sql = "select * from user";
            ResultSet rs = sta.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String lname = rs.getString("lname");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String email = rs.getString("email");
                user user = new user(id,lname,phone,address,email);
                userList.add(user);
            }
        } catch (Exception e){
           e.printStackTrace();
        }
        return userList;
    }
}
