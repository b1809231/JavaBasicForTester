package Bai7_XuLyMang;

public class DemoArray {
    public static void main(String[] args) {

        //Khai bao va khoi tao gia tri mang
        String sv[] = new String[3];

        //Gan gia tri mang
        sv[0] = "Tram Tien";
        sv[1]= "Tran Kim";
        sv[2] = "Nguyen Tram";

        //Truy xuat gia tri thu cong thong qua vi tri(index)
        System.out.println(sv[1]);

        //Duyet mang hang loat
        //Dung vong lap for de duyet mang

        //Do dai mang LENGTH

        //Cach 1 dung for don gian
        for(int i=0; i< sv.length; i++){ //i ta
            System.out.println(sv[i]);   // in ra tai vi tri chi dinh
        }

        System.out.println("------------Copy gia tri mang---------------");

        //Dieu kien copy mang thi mảng đc copy phải <= mảng chứa
        String svA[]= new String[5];
        //Copy gia gtri tu mang sv sang mang svA
        for(int i =0; i<sv.length; i++){
            svA[i] = sv[i];
        }
        for(int i=0; i< svA.length; i++){ //i ta
            System.out.println(svA[i]);   // in ra tai vi tri chi dinh
        }

    }
}
