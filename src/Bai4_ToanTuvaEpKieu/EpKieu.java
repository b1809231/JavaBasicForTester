package Bai4_ToanTuvaEpKieu;

public class EpKieu {
    public static void main(String[] args) {
        float c = 35.8f;
        int d = (int)c +1;

        long abc = d; //Biến abc đươcj phép lưu biến d vì nó rộng hơn d
        // int i = c+1; //=> báo lỗi, vì nó hẹp hơn ko chứa thằng rộng hơn được

        //Float về int
        System.out.println(c);
        System.out.println((int)c);
        System.out.println(d);
        System.out.println("-------------");


        //Số về dạng chuỗi
        String numberString = String.valueOf(d); //Hàm hỗ trợ chuyển dữ về of về dữ liệu string
        System.out.println(numberString);

        String numberString1 = String.valueOf(d) +30; //Cộng chuỗi
        System.out.println(numberString1);

        //Chuỗi về dạng số
        System.out.println(Integer.parseInt(numberString) +30);

        //Khi đọc file date ko quan tâm dât kiểu gì -> ép kiểu nó

        //Kiểu nhỏ sang lớn
        System.out.println("-------------");
        int i = 100;
        long l = i;
        float f= l;
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);

        //Lớn sang nhỏ
        System.out.println("-------------");
        double m = 100.04;
        long n = (long)m;
        int v = (int)n;
        System.out.println(m);
        System.out.println(n);
        System.out.println(v);

    }
}
