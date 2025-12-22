package Bai6_VongLap;

public class VongLapForCaiTien {
    public static void main(String[] args) {
        int number[] = {5, 7, 20, 10, 9};
        String name[] = {"Linh", "Hoa", "Tram", "Kim"};

        for (int i : number) {
            System.out.println(i);
            if (i == 20) {
                System.out.println("Ton tai so 20");
            }
        }
        for (String ten : name) {
            System.out.println(ten);
            if (ten == "Kim") {
                System.out.println("Co ten Kim");
            }
        }
    }
}
