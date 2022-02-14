package Encryption;

import java.util.ArrayList;

public class Encry {
    
public String [] getRev(ArrayList al)
{
    String ab[]=new String[al.size()];
   for(int i=0;i<al.size();i++)
   {
       ab[i]="";
       
       String str=(String)al.get(i);
   
       int x=(i%10)+1;
      
            String a=str.substring(0,str.length()-x);
    String b=str.substring(str.length()-x,str.length());
    String n="";
    n=b;
    n=n+a;
           
  
       ab[i]=n;
      
   }
   return ab;
}
public String[] getEnc(String str[])
{
    String str1[]=new String[str.length];
    for(int i=0;i<str.length;i++)
    {
        str1[i]="";
      String x=str[i];
      char ch[]=new char[x.length()];
        for (int j = 0; j < ch.length; j++) {
            ch[j]=x.charAt(j);
        }
         for (int j = 0; j < ch.length; j++) {
            int a=ch[j];
            a=a+15;
            char b=(char)a;
            ch[j]=b;
            str1[i]=str1[i]+ch[j];
        }
        
    }
    return str1;
}

}