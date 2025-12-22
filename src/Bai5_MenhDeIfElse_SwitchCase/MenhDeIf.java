package Bai5_MenhDeIfElse_SwitchCase;

public class MenhDeIf {
    public static void main(String[] args) {
        int tuoi = 19;

        if(tuoi>18){
            System.out.println("Điều kiện đúng. Bạn trên 18 tuổi");
        }

        String name = "java";
        if(name.equals("C#")){ //Chuỗi: equals: so sánh bằng ; contans: so sánh chứa
            System.out.println("Điều kiện đúng");
        }

        int a = 5;
        int b =10;
        if(a==5 & b==10){
            System.out.println("Điều kiện đúng");
        }
    }
}
