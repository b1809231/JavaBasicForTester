package Bai3_BienvaKieuDuLieu;

public class SinhVien1 {
    // biến static 'ten'
    public static String ten = "Võ Thái An";

    // biến static 'tuoi'
    public static int tuoi = 21;

    public static void main(String args[]) {
        // Sử dụng biến static bằng cách gọi trực tiếp
        System.out.println("Tên: " + ten);

        // Sử dụng biến static bằng cách gọi thông qua tên class
        System.out.println("Tuổi: " + SinhVien1.tuoi);
    }
}
