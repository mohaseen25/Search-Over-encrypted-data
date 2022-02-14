/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloud;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author USER
 */
public class DownloadFile {
    public void downloadDropboxFile(DbxClientV2 client,String filename) throws FileNotFoundException, DbxException, IOException
    {
        String Drive="F:\\SearchOED";
        File folder=new File(Drive);
        if(!folder.exists())
            folder.mkdirs();
        String path=Drive+"\\"+filename;
        String fname="/"+filename;
        System.out.println("path "+path);
        
         OutputStream downloadFile = new FileOutputStream(path);
                try
                {
                FileMetadata metadata = client.files().downloadBuilder(fname)
                        .download(downloadFile);
                }
                finally
                {
                    downloadFile.close();
                }

                
                
                
                
                File lf[]=folder.listFiles();
                System.out.println("Downloaded file is "+filename+" Frames is "+lf.length);
                
                
//                FileDownloadFrame.path=path;
//                SearchEngine.path=path;

        
    }
   
}
