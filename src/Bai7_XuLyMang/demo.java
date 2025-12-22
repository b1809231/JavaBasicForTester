package Bai7_XuLyMang;

public class demo {
    public static void main(String[] args) {

        int number[] = new int[30];
        int j =0;
        for (int i=0; i<50; i++){
            if(i%2==0){
                System.out.println(i);
                number[j]= i;
                j++;
            }
        }

        System.out.println("----------------Duyet mang------------");
        for (int i =0; i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
