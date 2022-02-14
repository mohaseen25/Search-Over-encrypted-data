
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DataFetcher {
    public ArrayList DataFetcher(String uname)
    {
        
       String data[][];
        ArrayList al=new ArrayList();
       
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
            
             while(rs1.next())
             {
            
            row++;
             }
              int i=0;
              
              data=new String[row][7];
               while(rs2.next())
             {
                 int j=0;
            data[i][j++]=rs2.getString(1);
            data[i][j++]=rs2.getString(2);
              data[i][j++]=rs2.getString(3);
            data[i][j++]=rs2.getString(4);
             data[i][j++]=rs2.getString(5);
            data[i][j++]=rs2.getString(6);
             data[i][j]=rs2.getString(7);
           
             i++;
            
             }
                     int r=0; 
               for(int k=0;k<data.length;k++)
               {
                   for(int l=0;l<data[0].length;l++)
                   {
                   if(data[k][l].equals(uname))
                   {
                      r=k;
                   }
                   }
               }
              for (int j = 0; j < 7; j++) {
                al.add(data[r][j]);
                 
            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
      
    return al;
    }
}
