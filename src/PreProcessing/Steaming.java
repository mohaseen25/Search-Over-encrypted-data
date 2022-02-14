/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreProcessing;

/**
 *
 * @author USER
 */
public class Steaming {
    public String[] steaming(String str)
    {
       
        String str1[]=str.split(" ");
     
       
       
    
           String str2[]=new String[(str1.length)];
           int ct=0;
            for(int i=0;i<str1.length;i++)
        {
            String x=str1[i];
           if(x.endsWith("ing") )
            {
                 String str3=x.substring(0,x.length()-3);
                 str2[ct++]=str3;
            }
            else
            {
                str2[ct++]=str1[i];
                
            }
        }
           
            return str2;
    }
}
