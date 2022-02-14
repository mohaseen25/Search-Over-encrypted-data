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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
public class TextFileReader {
    public String getContent(String path) 
    {
        String count="";
        try
        {
            FileInputStream f=new FileInputStream(path);
            int x=0;
            StringBuffer sb=new StringBuffer();
            do
            {
                x=f.read();
              //  System.out.println("X= "+x);
                if(x!=-1)
                {
                    char ch=(char)x;
                    sb.append(ch);
                }
            }while(x!=-1);
            count=sb.toString();
            f.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception in class TextFileReader........"+ex);
        }
        return count;
    }
}
