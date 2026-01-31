package Bai16_MoHinhPOM.common;



public class BaseTest {

    private String browser = "CHROME";

    public void createDriver() {
        System.out.println("Mở trình duyệt: " + browser);
    }

    public void closeDriver() {
        System.out.println("Đóng trình duyệt: " + browser);
    }
}
