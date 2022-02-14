/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReadandWrite;

/**
 *
 * @author USER
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileWriter {
     public boolean createFile(String str,String path) 
    {
        boolean val=false;
        try
        {
            FileOutputStream f2=new FileOutputStream(path);
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
              //  System.out.println("ch "+ch);
                int y=(int)ch;
              //  System.out.println("y "+y);
                f2.write(y);
                
            }
            f2.close();
            val=true;
        }
        catch(Exception ex){}
        return val;
    }
    
}
