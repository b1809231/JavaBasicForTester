package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDung {

    public String name; //Khai báo giá trị, có thể gán giá trị cho biến ko
    public int age;  //Nhưng tạo giá trị rồi nó tơr thành khởi tạo


    //Khai báo hàm xây dựng
    public DemoHamXayDung(){
        System.out.println("Đang ở hàm xây dựng");

        //Khởi tạo trước hàm main, khởi taọ giá trị cho name,age

        //Gán giá trị cứng
        name = "Anh";
        age = 14;
    }

    //Hàm xây dựng ko có tham số
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
    }

    //Hàm xây dựng có tham số

    public static void main(String[] args) {
        DemoHamXayDung xd = new DemoHamXayDung();
        xd.showInfo();


    }
}
