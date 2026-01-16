package Bai13_TrangThaiStatic;

public class DemoKhoiStatic {
    public String name;
    public int age;
    public static String className = "Dai hoc Cong Nghe";

    //Khối static
    static{
        System.out.println("Day la khoi static");
    }

    //Khối static chạy trước main - chạy trước gì đó giúp chạy các giá trị đầu
    public static void main(String[] args) {
        System.out.println(className);
    }



    }
