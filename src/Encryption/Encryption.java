/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Encryption {
    public String getEncryptedFile(String str)
    {
         ArrayList block = new Block().getDev(str);

            Encry ec = new Encry();
            String rev[] = ec.getRev(block);

            String EncArray[] = ec.getEnc(rev);
            String EncFile = "";
            for (int i = 0; i < EncArray.length; i++) {
                EncFile = EncFile + EncArray[i];
            }
            return EncFile;
    }
}
