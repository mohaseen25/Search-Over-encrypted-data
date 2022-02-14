
package Bucket;

import java.util.ArrayList;


public class Bucket {
    public String getBucket(String str)
    {
        String str1[]=str.split(" ");
        ArrayList al=new ArrayList();
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i].length()<3)
            
            {
            
                al.add(str1[i]);
            
            }
            int ct=3;
           while(ct<=str1[i].length())
            {
             
            String x=str1[i].substring(0,ct);
          
               al.add(x);
               ct++;
            }
            
        }
       
            Hashing hs = new Hashing();
            String hashing = "";
            for (int i = 0; i < al.size(); i++) {
                String x = (String) al.get(i);
                x = hs.MDfive(x);
                hashing = hashing + x + " ";
            }
        return hashing;
    }
}
