package Bai7_XuLyMang;

public class DemoArray2 {
    public static void main(String[] args) {
        int number[] = new int[10];
        //Gan gia tri mang thong qua for
        for(int i=0; i<number.length; i++){
            number[i]= i+1;
        }


        //Duyet mang number bang For cai tien
        for(int n:number){
            System.out.println(n);
        }

        String emailList[]= new String[4];
        emailList[0] ="abc@gmial.com";
        emailList[1] = "nkdjsk@gmail.com";
        System.out.println(emailList[0]);
        System.out.println(emailList.length);


        //Khai bao va gan gia tri chop mang truc tiep( nac danh)
        String emailList2[] = {"a@gmial.com","b@gmail.com","djkfdk"};
        System.out.println(emailList2[1]);
        System.out.println(emailList2.length);
    }
}
