package Bai13_TrangThaiStatic;

public class DemoHamStatic {
    public String name;
    public int age;
    public static String className = "Dai hoc Cong Nghe";

    public String getName(){
        return name;
    }

    public static void getInfo(){
        System.out.println(className); //Hàm static gọi trực tiếp biến static

//        Phương thức static không thể sử dụng biến non-static hoặc gọi trực tiếp phương thức non-static.
//        Từ khóa this và super không thể được sử dụng trong ngữ cảnh static.

        DemoHamStatic hamstatic = new DemoHamStatic();
        System.out.println(hamstatic.name);  //biến thông thường phải gọi qua đối tượng
        //System.out.println(getName()); //Hàm thông thường ko thể gọi trong hàm static
        System.out.println(hamstatic.getName());// Phải gọi thông qua đối tượng


    }
}
