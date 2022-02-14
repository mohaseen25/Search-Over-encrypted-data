package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Catalog {
public boolean InsertTiming(String username,String file,String time)
{
  
     boolean flag=false;
        try
        {
          
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/searched","root","root");
            Statement st=co.createStatement();
            String query="insert into catalog  value('"+username+"','"+file+"','"+time+"')";
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

