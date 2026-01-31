package Bai17_TryCatch_Exception;

public class DemoTrycatch3 {
    public static void main(String[] args) {
        try{
            int data = 5/0;
        } finally { //code trong khối này luôn luôn chạy
            //in ra màn hình tên ngoại lệ
            // ko dùng này nhiều nha vì trên đúng hay sai thì khối lệnh này vẫn chạy vô lý
            System.out.println("Đây là lỗi chia 0, sai quy tắc");

        }
        System.out.println("Phép chia cho 0");
    }
}
