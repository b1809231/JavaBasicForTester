package constants;

import java.util.ArrayList;

public class ConfigData {
    public static String URL ="https://crm.anhtester.com";
    public static String BROWSER_NAME = "Chrome";
    public static String USERNAME = "admin@example.com";
    public static String PASWORD = "123456789";
    public static Object bien1 = new ArrayList<String>();
    //Ko nên dùng kiểu dữ liệu object vì ko xác định đc kiểu dữ liệu của biến

    public static void clickElement() {
        System.out.println("Click on element");
    }


}
