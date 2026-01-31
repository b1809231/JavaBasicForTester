package Bai18_FileProperties.helpers;

import java.io.File;

public class Helpers {
    public static String getCurrentDir(){
        //Lấy đường dẫn của ổ đĩa đến project của mình
        String curent = System.getProperty("user.dir") + File.separator;
        return curent;
    }
}
