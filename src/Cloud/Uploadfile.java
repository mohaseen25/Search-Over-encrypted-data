package cloud;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.UploadErrorException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Uploadfile {

    public void uploaddropboxFile(DbxClientV2 client, String path) throws FileNotFoundException, DbxException, UploadErrorException, IOException {
        System.out.println("abs apath " + path);
        String str1 = path.replace(File.separator, "#");
        System.out.println("str1 " + str1);
        String str[] = str1.split("#");
        String x = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].endsWith(".txt")) {
                x = str[i];
            }
        }
        String str2 = x;
        System.out.println("name " + str2);

        try (
                InputStream in = new FileInputStream(path)) {
            FileMetadata metadata = client.files().uploadBuilder("/" + str2)
                    .uploadAndFinish(in);

            System.out.println("File Uploaded Successfully");
        }
    }
}
