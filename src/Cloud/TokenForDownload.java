
package Cloud;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.users.FullAccount;
import java.io.IOException;



public class TokenForDownload {
public  void AccessTokenforDownload(String fname,String token) throws DbxException, IOException
{
    String ACCESS_TOKEN=token;
     DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
       
        FullAccount account = client.users().getCurrentAccount();

                   
       System.out.println(account.getName().getDisplayName());
    
        
        DownloadFile df=new DownloadFile();
      df.downloadDropboxFile(client, fname);
      
}
}