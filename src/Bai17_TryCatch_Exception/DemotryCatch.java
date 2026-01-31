package Bai17_TryCatch_Exception;

public class DemotryCatch {
    public void setTimeout(String timeout){
        System.out.println("Set timeout: " + Integer.parseInt(timeout));
        System.out.println("Đã set xong!!");
    }

    public static void main(String[] args) {
        DemotryCatch demoTc = new DemotryCatch();
        demoTc.setTimeout("20s");
    }
}
