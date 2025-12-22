package Bai4_ToanTuvaEpKieu;

public class ToanTu {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%3);
        System.out.println(a+=b); //tương đương a=a+b

        System.out.println(a<5 && b>0); //ket qua boolean -> false
        System.out.println(a<5 || b>0); //->true
        System.out.println(!(a<5 && b>0)); // -> true phu dinh cua tren
        System.out.println(a!=b);

        //Muốn lấy giá trị cũ của a phía trên (a=10) thì tạo biến mới or a-=b kkk
        System.out.println(a);
        System.out.println(a=a+1);

    }
}
