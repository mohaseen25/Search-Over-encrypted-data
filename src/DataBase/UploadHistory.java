
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import searchoverencrepteddata.ShowUploadHistoryFrame;


public class UploadHistory {
    public ArrayList getUploadHistory(String username)
{
  String ar[][];
  ArrayList al=new ArrayList();
     boolean flag=false;
        try
        {
         
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/searched","root","root");
            Statement st1=co.createStatement();
            Statement st2=co.createStatement();
            String query="select * from catalog where username = '"+username+"'";
             ResultSet rs1=st1.executeQuery(query);
            ResultSet rs2=st2.executeQuery(query);
            int row=0;
            String passww="";
             while(rs1.next())
             {
            
            row++;
             }
               ar=new String[row][3];
              int i=0;
             while(rs2.next())
             {
                 int j=0;
            ar[i][j++]=rs2.getString(1);
            ar[i][j++]=rs2.getString(2);
              ar[i][j++]=rs2.getString(3);
           
           
             i++;
            
             }
             for (int j = 0; j < ar.length; j++) {
                 for (int k = 0; k < ar[0].length; k++) {
                    al.add(ar[j][k]);
                 }
            }
         
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag=false;
        }
        return al;
    }
}
