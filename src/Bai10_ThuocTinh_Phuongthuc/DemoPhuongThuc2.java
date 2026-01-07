package Bai10_ThuocTinh_Phuongthuc;

import java.util.ArrayList;

public class DemoPhuongThuc2 {

    int number = 21;

    public void KiemtraSoChan(){
        if(number%2 == 0){
            System.out.println("La so chan");
        }else {
            System.out.println("La so le");
        }
    }

    //Ham co tham so
    public ArrayList<Integer> TimSoChan(int number) {
        ArrayList arr = new ArrayList();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                arr.add(i);
            }
        }
        return arr; //tra ve arr da chua nhung so chan
    }

    public static void main(String[] args) {
        DemoPhuongThuc2 demo2 = new DemoPhuongThuc2();
        demo2.KiemtraSoChan();
        //demo2.TimSoChan(30);
        for (int sochan: demo2.TimSoChan(30)){
            System.out.println(sochan);
        }
    }
}
