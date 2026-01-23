package Bai15_DaHinhVaTruuTuong.DaHinh;

public class KetQua {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.tinhTong(1,35,432));
        System.out.println(cal.tinhTong(1,42));

        System.out.println(cal.phepNhan(2,3));
        System.out.println(cal.phepNhan(534,2F));
    }
}
