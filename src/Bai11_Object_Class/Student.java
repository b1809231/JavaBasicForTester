package Bai11_Object_Class;

public class Student {
    String name = "Nguyen Kim Tien";
    int age = 24;
    String address = "HCM";
    String phone = "0847648268";

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
         //Khai baos thuoc tinh thuoc lop student
        Student sv1 = new Student();
        sv1.displayInfo();
        System.out.println(sv1.getName());


        //Khai báo đầy đủ
        //class nhiều object
        //object ko được trùng tên khi tạo
        // 1 đối tượng ko đại diện cho 2 lớp = Object đại diện cho 1 class
        // 1 lớp có thể có nhiều đối tượng đại diện = Class gồm nhiều Object
        //Còn tuỳ thuộc vào phạm vi truy cập mà đối tượng có thể truy cập vào thành phần lớp khác ko

        Student sv2 = new Student();


        //Khai báo kiểu annonymous: dùng liền ko sài nữa thì sài kiểu này
        new Student().displayInfo();


    }
}
