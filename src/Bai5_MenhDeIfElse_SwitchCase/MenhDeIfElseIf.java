package Bai5_MenhDeIfElse_SwitchCase;

public class MenhDeIfElseIf {
    public static void main(String[] args) {
        float gpa = 3.3f;

        if (gpa >= 3.6 && gpa <= 4) {
            System.out.println("Ban dat loai XUAT SAC");
        } else if (gpa >= 3.2 && gpa < 3.6) {
            System.out.println("Ban dat loai GIOI");
        } else if (gpa >= 2.5 && gpa < 3.2) {
            System.out.println("Ban dat loai KHA");
        } else if (gpa >= 2.0 && gpa < 2.5) {
            System.out.println("Ban dat loai TRUNG BINH");
        } else {
            System.out.println("Ban dat loai YEU");
        }

    }

}
