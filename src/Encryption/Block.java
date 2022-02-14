
package Encryption;

import java.util.ArrayList;

public class Block {
    public ArrayList getDev(String str)
    {
         int count=str.length();
     
        int div=count/10;
       int rem=count%10;
        
       char arr[][]=new char[div][10];
      
       
       int h=0;
        for(int j=0;j<div;j++)
        {
            int k=0;
           
        for(int i=0;i<10;i++)
        { 
               arr[j][i]=str.charAt(h+i);
            
        }
        h=h+10;
        }
        
       char arr2[]=new char[rem];
        int zz=0;
        for(int i=(count-rem);i<count;i++)
        {
            arr2[zz]=str.charAt(i);
      
            zz++;
        }
        String re[]=new String[div+1];
         for(int i=0;i<div;i++)
        {
            re[i]="";
            for(int l=0;l<10;l++)
            {
           re[i]=re[i]+arr[i][l];
          
            }
           
        }
         re[div]="";
         int ct=(10-rem);
         for(int i=0;i<rem;i++)
         {
             
         re[div]=re[div]+arr2[i];
         }
         for(int i=0;i<ct;i++)
         {
             re[div]=re[div]+" ";
         }
         ArrayList <String> ar = new ArrayList<String>();
          for(int i=0;i<=div;i++)
         {
            
          ar.add(re[i]);
            
         }
         return ar;
    }
    
    
}
