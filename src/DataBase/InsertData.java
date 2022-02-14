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
public class InsertData {
    public boolean Insert(String Name,String Email,String Contact,String Username,String Password,String Gender,String Address)
    {
     boolean flag=false;
        try
        {
            //Name, Email, Contact, Username, Password, Gender, Address
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/searched","root","root");
            Statement st=co.createStatement();
            String query="update userdata  set Name ='"+Name+"',Email='"+Email+"',Contact='"+Contact+"',Password='"+Password+"',Gender='"+Gender+"',Address='"+Address+"'where Username='"+Username+"'";
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