package Bai9_XuLyChuoiString;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {
        String name = " Hello Summi ";


        System.out.println("=====CHUYỂN HOA THƯỜNG=====");
        //Để 1 String riêng lẻ ko đc
        //"autotest" khai báo vầy ko đc
        //Để 1 String riêng lẻ phải . gọi hàm
        //"autotest".replace("test","yep") phải vậy thì được
        System.out.println("autotest".toUpperCase()); //chuyển thành chữ hoa
        //ko thì khai báo biến
        String str = "autoshare";
        System.out.println(str.toUpperCase());


        System.out.println("=====thay thế chuỗi=====");
        String str2 = "java basic";
        System.out.println(str2.replace("basic", "core"));


        //Nối chuỗi:Dùng dấu cộng để ghép chuỗi lại với nhau
        System.out.println("=====nối chuỗi=====");
        String fullName = "Họ và tên: " + name;
        System.out.println(fullName);

        //Tách chuỗi
        //split trả về một mảng, cần in ra mảng
        System.out.println("=====tách chuỗi=====");
        String str3 = "Xử lý chuỗi";
        System.out.println(Arrays.toString(str3.split(" ")));

    }
}
