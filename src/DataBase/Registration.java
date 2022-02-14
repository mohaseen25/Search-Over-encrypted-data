/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Registration {
     public boolean getRegistered(String Name,String gen,String add,String contact,String email,String username,String pass)
    {
        boolean flag=false;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/searched","root","root");
            Statement st=co.createStatement();
            String query="insert into userdata  value('"+Name+"','"+email+"','"+contact+"','"+username+"','"+pass+"','"+gen+"','"+add+"')";
            int x=st.executeUpdate(query);
            if(x>0)
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag=false;
        }
        return flag;
    }
}
