package Bai11_Object_Class;

public class ThongTin {
    double hocphi = 15000000;
    float vat = 10;

    public double getHocPhi(){
        return hocphi;
    }

    public float getVat(){
        return vat;
    }

    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.displayInfo();

        ThongTin tt1 = new ThongTin();
        tt1.getHocPhi();

        //Khai báo kiểu annonymous
        new Student().displayInfo();
    }
}
