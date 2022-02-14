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
public class downloadcatalog {
    public boolean InsertTiming(String username,String file,String time)
{
  
     boolean flag=false;
        try
        {
          
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/searched","root","root");
            Statement st=co.createStatement();
            String query="insert into downloadcatalog  value('"+username+"','"+file+"','"+time+"')";
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
