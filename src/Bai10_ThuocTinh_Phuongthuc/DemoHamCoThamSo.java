package Bai10_ThuocTinh_Phuongthuc;

public class DemoHamCoThamSo {

    //Khai báo hàm có 2 tham số với kiểu dữ liệu tương ứng
    public static int tong2SoNguyen(int num1, int num2){
        return num1 + num2;
    }

    public static void showInfo(String name, int age, String address){
        System.out.println("Họ và tên: " +name);
        System.out.println("Tuổi: " +age);
        System.out.println("Địa chỉ: " +address);
    }

    public static float TinhDienTich(float cdai, float crong ){
        return cdai * crong;
    }

    public static void main(String[] args) {
        System.out.println("tong hai so nguyen = " +tong2SoNguyen(3,7));

        showInfo("Han", 20, "Hau Giang");
        showInfo("Giang", 18, "Hau Giang");
        showInfo("Nam", 29, "Can Tho");

        System.out.println();

        //Truyền tham số nhớ lưu ý kiểu dữ liệu của tham số
        //Dùng Rename để đổi tên hàm nhanh, ko cần phải sửa dứoi này nhiều
        System.out.println("Dien tich " + TinhDienTich(4,3.5f));

    }
}
