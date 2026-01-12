package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDungCoThamSo {

    public String name; //Khai báo giá trị, có thể gán giá trị cho biến ko
    public int age;  //Nhưng tạo giá trị rồi nó tơr thành khởi tạo
    //public String address;

    //Khai báo hàm xây dựng có tham số
    public DemoHamXayDungCoThamSo(String name, int age){
        System.out.println("Đang ở hàm xây dựng");

        //Khởi tạo trước hàm main, khởi taọ giá trị cho name,age
        //this: đại diện cho các thành phần tong class
        this.name = name;
        this.age = age;
    }

    public DemoHamXayDungCoThamSo(String name, int age, String address){
        System.out.println("Đang ở hàm xây dựng đa hình");

        //Khởi tạo trước hàm main, khởi taọ giá trị cho name,age
        //this: đại diện cho các thành phần tong class
        this.name = name;
        this.age = age;
        //this.
    }

    public DemoHamXayDungCoThamSo(){
        System.out.println("Đang ở hàm xây dựng đa hình");
        //Khởi tạo trước hàm main, khởi taọ giá trị cho name,age
        //this: đại diện cho các thành phần tong class
        this.name = name;
        this.age = age;
        //this.
    }

    //Hàm xây dựng ko có tham số
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
    }

    //Tính đá hình: 1 hàm có thể trùng tên nhưng khác nhau về số lượng tham số và kiểu dl của tham số
    public void showInfo(String abc){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
    }

    //Hàm xây dựng có tham số

    public static void main(String[] args) {

        //Chỉ có hàm xây dựng mới khởi tạo đc giá trị bên trong class
        DemoHamXayDungCoThamSo xd1 = new DemoHamXayDungCoThamSo("Hoa", 20);
        xd1.showInfo();
        DemoHamXayDungCoThamSo xd2 = new DemoHamXayDungCoThamSo("Luan", 20);
        xd2.showInfo();

        DemoHamXayDungCoThamSo xd3 = new DemoHamXayDungCoThamSo("Luan", 20,"Bac Lieu");
        xd3.showInfo();

        //Hàm ko có tham số, để gọi hàm trong class
        DemoHamXayDungCoThamSo xd4 = new DemoHamXayDungCoThamSo();
        xd4.showInfo();

        // ======> hàm xây dựng để tạo giá trị thôi, hàm bình thường để gọi đc các method trong class


    }
}
