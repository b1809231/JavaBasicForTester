package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHocSinh_PhamViTruyCap {

    //Default
    //ko khai báo từ khoá pvtc => nó mặc định là default
    int age = 15;
    String phone = "4035894759";

    //Protected
    protected String getPhone(){
        return phone;
    }


    //Public
    public int getAge(){
        return age;
    }

}
