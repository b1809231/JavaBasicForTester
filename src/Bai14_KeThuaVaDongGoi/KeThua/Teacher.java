package Bai14_KeThuaVaDongGoi.KeThua;

public class Teacher extends Person{
    private double luong;
    public Teacher(String name, int age, float height, double luong) {
        super(name, age, height);
        this.luong = luong;
    }

    public static void main(String[] args) {
        Teacher tc = new Teacher("Hanh", 30,1.6f, 12242345);
        tc.getInfo();
        System.out.println("Lương: " +String.valueOf(tc.luong));
    }
}
