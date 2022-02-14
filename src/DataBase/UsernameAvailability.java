package DataBase;
import java.sql.*;
import javax.swing.JOptionPane;
public class UsernameAvailability {
     
        
        
         public boolean checkUsername(String username)
    {
        boolean flag=true;
        String data[];
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
              data=new String[row];
               while(rs2.next())
             {
            data[i]=rs2.getString(4);
             
             i++;
            
             }
               for(int k=0;k<data.length;k++)
               {
                   if(data[k].equals(username))
                   {
                       flag=false;
                   }
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