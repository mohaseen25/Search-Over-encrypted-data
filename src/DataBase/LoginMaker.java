/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class LoginMaker {
    public boolean isLogin(String username,String pass)
    {
       
        String data[][];
         boolean flag1=false;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/searched","root","root");
            Statement st1=co.createStatement();
            Statement st2=co.createStatement();
            
            String query="select * from userdata ";
            ResultSet rs1=st1.executeQuery(query);
            ResultSet rs2=st2.executeQuery(query);
            int row=0;
            String passww="";
             while(rs1.next())
             {
            
            row++;
             }
              int i=0;
              data=new String[row][2];
               while(rs2.next())
             {
            data[i][0]=rs2.getString(4);
             data[i][1]=rs2.getString(5);
             i++;
            
             }
               boolean flag=false;
               for(int j=0;j<row;j++)
               {
                   if(username.equals(data[j][0]))
                   {
                      
                       passww=data[j][1];
                       flag=true;
                   }
                   
               }
              
                if(flag)
                {
               if(pass.equals(passww))
               {
                  flag1=true;
                   
               }
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
        return flag1;
    }
}
