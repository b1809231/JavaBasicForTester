package Bai10_ThuocTinh_Phuongthuc;

import org.w3c.dom.ls.LSOutput;

public class DemoPhuongThuc {


    //Hàm có kết quả trả về
    public String getAddress(){
        return "Can Tho";
    }

    //Hàm ko trả về
    public void displayAddress(){
        System.out.println("Chao mung moi nguoi den voi");
        System.out.println(getAddress());
    }

    public static String maSoxe(){
    return "65";
    }


    //Hàm trả về mang giá trị nhất định, theo kiểu dữ liêuk của hàm đó, có thể đem nó đi tính toán tiếp
    public static float chieuDai(){
        return 11;
    }
    public static float chieuRong(){
        return 7.5F;
    }

    public static float tinhDienTich(){
        return chieuDai()*chieuRong();
    }


    // Ví dụ không thể lấy 1 kiểu trả về nhân cho void đc


    //Do hàm main có trạng thái static nên khi gọi hàm phải gọi thông qua đối tượng lớp
    //Hoặc thêm từ khoá static vào các hàm khác
    public static void main(String[] args) {

        //Tạo đối tượng lớp do hàm ko có từ khoá static
        DemoPhuongThuc pt = new DemoPhuongThuc();
        pt.displayAddress();

        //Thêm từ khoá static cho hàm
        System.out.println(maSoxe());

        System.out.println(tinhDienTich());

    }
}
