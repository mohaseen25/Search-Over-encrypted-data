package PreProcessing;

public class SpecialSymb {
public String RemoveSymb(String str)
{
    char ch[]=new char[str.length()];
    
    int z=0,count=0;
    for(int i=0;i<ch.length;i++)
    {
        ch[i]=str.charAt(i);
    }
    for(int i=0;i<ch.length;i++)
    {
        int x=ch[i];
      if((x>=33 && x<=47) || (x>=58 && x<=64) || (x>=91 && x<=96) || (x>=123 && x<=126)||(x>=146 && x<=148))
      {
          count++;
         
      }
     
      
    }
    char ch1[]=new char[(ch.length-count)];
     for(int i=0;i<ch.length;i++)
    {
        int x=ch[i];
      if((x>=33 && x<=47) || (x>=58 && x<=64)|| (x>=91 && x<=96) || (x>=123 && x<=126)||(x>=146 && x<=148))
      {
          continue;
      }
     else
      {
          ch1[z++]=ch[i];
      }
      
    }
        String str1="";
        
    for(int i=0;i<ch1.length;i++)
    {
        str1=str1+ch1[i];
    }
    return str1;
}
}
