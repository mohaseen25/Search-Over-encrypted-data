
package cloud;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.users.FullAccount;
import java.io.IOException;


public class AccessToken {
    public void AccessToken(String token,String path)
    {
     String ACCESS_TOKEN=token;   
  
                       DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
                       DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
                       
                       FullAccount account = null;
                       try {
                           account = client.users().getCurrentAccount();
                       } catch (DbxException ex) {
                           System.out.println(ex);
                       }
                       System.out.println(account.getName().getDisplayName());
        
        
                    Uploadfile uf=new Uploadfile();
                       try {
                           uf.uploaddropboxFile(client,path);
                       } catch (DbxException ex) {
                           System.out.println(ex);
                         
                       } catch (IOException ex) {
                          System.out.println(ex);
                       }
    }
}