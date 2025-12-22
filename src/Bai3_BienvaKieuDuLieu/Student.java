package Bai3_BienvaKieuDuLieu;

public class Student {

    static int a= 100;  // Biến instance nè
    public static String ten= "Nguyen Kim Anh"; //Biến static
    public String noiSinh = "Can Tho";  //Đây là 1 biến bình thường ko phải static

    public void sayHello(){
       int b = 10; //Biến local nè: nằm trong hàm
        b = b+tinhLaiSuat();
       System.out.println("Gia tri cua n la:" +b);
   }

    public static int tinhLaiSuat(){
        int laiSuat = 800000;
        return laiSuat;
    }


    public static void main(String[] args) {
        String name = "Summi cute";
        int c =1;
        String get_Account_Student ="summicute@example.com";

        System.out.println(name);
        System.out.println(c);
        System.out.println(get_Account_Student);

        //gọi biến cục bộ
        System.out.println(a);

        //gọi biến static: nằm trong hàm static gọi bình thường
        System.out.println(ten);

        //Để gọi biến thường
        Student student = new Student();
        System.out.println(student.noiSinh);

    }
}
