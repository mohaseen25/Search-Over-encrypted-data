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
public class PrePro {
    public String getPrePro(String File)
    {
     File=new SpecialSymb().RemoveSymb(File);
    File=File.toLowerCase();
      String File1[]=File.split(" ");
      String StopWord[]=new StopWord().StpWrd(File1);
      String a="";
        for (int i = 0; i < StopWord.length; i++) {
            a=a+StopWord[i]+" ";
        }
          
       String Steaming[]=new Steaming().steaming(a);
        String b="";
        for (int i = 0; i < Steaming.length; i++) {
            b=b+Steaming[i]+" ";
        }
 return b;
}
}