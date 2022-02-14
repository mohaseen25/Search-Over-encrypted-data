package Decryption;

import java.util.ArrayList;

public class Decrypt {

public String getDecrypt(String str)
{
    char ch[]=new char[str.length()];
    for(int i=0;i<str.length();i++)
    {
        ch[i]=str.charAt(i);
        int x=ch[i];
        x=x-15;
        char a=(char)x;
        ch[i]=a;
    }
    String str1="";
    for (int i = 0; i < ch.length; i++) {
        str1=str1+ch[i];
    }
    return str1;
}
public String getStr(ArrayList al)
{
    String str[]=new String[al.size()];
    for (int i = 0; i < str.length; i++) {
        str[i]=(String)al.get(i);
        
    }
    for(int i=0;i<str.length;i++)
    {
        int x=(i%10)+1;
        String a=str[i].substring(0,x);
        String b=str[i].substring(x,str[i].length());
        String re="";
        re=b;
        re=re+a;
        str[i]=re;
    }
    String fin="";
    for (int i = 0; i < str.length; i++) {
        fin=fin+str[i];
    }
   return fin;
}
}
