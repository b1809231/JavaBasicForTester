package Bai5_MenhDeIfElse_SwitchCase;

public class MenhDeIfElse {
    public static void main(String[] args) {
        String address = "Can Tho";
        String phone = "123456";
        if (address.equals("Can Tho")) {
            System.out.println("Dia chi can Tho");
        } else {
            System.out.println("Dia chi tinh khac");
        }

        int tuoi = 30;
        if (tuoi < 18) {
            System.out.println("Bạn chưa thể xem phim Thế giới khủng long");
        } else {
            System.out.println("Bạn được xem Thế giới khủng long");
        }

        boolean checkLogin = true;
        if (checkLogin == true) {
            System.out.println("Login success");
        } else {
            System.out.println("Invalid email or Password");
        }

        int a =5;
        int b =10;
        if((a+b) >=10){
            System.out.println("Lớn hơn 10");
        }else{
            System.out.println("Nhỏ hơn 10");
        }
    }
}
