package Bai17_TryCatch_Exception;

public class DemoTryCatch1 {
    public static void main(String[] args) {

//        int data = 5/0;
//        System.out.println("Phép chia cho 0, sai thực tế");
//        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        //	at Bai17_TryCatch_Exception.DemoTryCatch1.main(DemoTryCatch1.java:6)

        try{
            int data = 5/0;
        } catch (ArithmeticException e){
            //in ra màn hình tên ngoại lệ
            System.out.println("Đây là lỗi chia 0, sai quy tắc");
        }
        System.out.println("Phép chia cho 0");
    }
}
