package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

public class DemoProtected {

    //Protected dùng cho biến , phương thức, contructor, ko áp dụng cho class
    //truy cập bên trong package và ngoài pakage nếu nó kết thừa

    protected String  address = "Hà Nội";

    protected String getAddress(){
        return address;
    }
}
