package Bai14_KeThuaVaDongGoi.DongGoi;

public class ThongTinDongGoi {
    public static void main(String[] args) {
        Student st1 = new Student();

        //gán giá trị thông qua hàm set
        st1.setName("Ngan");
        st1.setAge(12);
        st1.setPhone("234892347");
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getPhone());

        Student st2 = new Student();

        //gán giá trị thông qua hàm set
        st2.setName("Hoa");
        st2.setAge(12);
        st2.setPhone("234892347");
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getPhone());

    }

}
