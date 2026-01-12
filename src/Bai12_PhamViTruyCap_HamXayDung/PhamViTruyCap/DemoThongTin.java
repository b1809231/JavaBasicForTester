package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

import Bai11_Object_Class.ThongTin;
import Bai12_PhamViTruyCap_HamXayDung.HamXayDung.DemoHocSinh_PhamViTruyCap;

public class DemoThongTin extends DemoHocSinh_PhamViTruyCap {
    //extend để demo protected, đại diện cho kế thừa

    public static void main(String[] args) {

        //Note: truy cập biến phải kèm hành động
        //Ví dụ
        // DemoProtected pr = new DemoProtected();  pr.address
        // SAI ======> Kiểu là lấy giá trị đại chỉ đó... (làm gì thì ko nói nữa ???)
        // DemoProtected pr = new DemoProtected(); System.out.println(pr.address);
        // ĐÚNG =====> Kiểu là: In cái địa chỉ này ra

        // Lưu ý: gọi class nào lấy class đó thì chuẩn hơn



        //PRIVATE
        DemoPrivate demoPrivate = new DemoPrivate();
        // Phạm vi truy cập private chỉ truy cập trong lớp
        //Nên khi lớp thông tin gọi biến name thì báo lỗi
        // demoPrivate.name; => Lỗi
        System.out.println(demoPrivate.getName());




        //DEFAULT
        //Phạm vi truy cập dèault chỉ dùng trong cùng 1 package
        // Nên khi gọi ở đây thì lỗi
        //ko khai báo từ kháo phạm vi truy cập nào thì nó mặc định là kiểu default
        DemoHocSinh_PhamViTruyCap hs = new DemoHocSinh_PhamViTruyCap();
        //hs.age;
        DemoDefault df = new DemoDefault();
        System.out.println(df.age);



        //PROTECTED
        // Dùng extend kế thừa, nếu bỏ khai báo kế thừa ở trên thì ko gọi đc
        //
        DemoProtected pr = new DemoProtected();
        System.out.println(pr.address);
        // Lưu ý: gọi class nào lấy class đó thì chuẩn hơn
        // => chỗ hàng dứoi gọi class demohocsinh chuẩn hơn
        DemoThongTin tt = new DemoThongTin();
        tt.getPhone(); //Gọi đc phạm vi protected khi kế thừa




        //PUBLIC
        // Phạm vi gọi được ở mọi nơi
        DemoHocSinh_PhamViTruyCap hs1 = new DemoHocSinh_PhamViTruyCap();
        hs.getAge();




    }
}
