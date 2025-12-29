package Bai9_XuLyChuoiString;

import java.util.Arrays;

public class XuLyChuoi {
    public static void main(String[] args) {
        String str1= "tổng hợp CÁC PHƯƠNG THỨC XỬ LÝ CHUỖI (String) " +
                "CƠ BẢN TRONG JAVA, đúng kiểu người mới học – tester " +
                "dễ dùng, kèm ví dụ ngắn gọn";
        String str2= "Ví dụ là: ";


        //Cắt chuỗi: dùng hàm substring
        System.out.println("-Cắt chuỗi từ ví trí: " + str1.substring(9));
        System.out.println("-Cắt chuỗi từ vị trí đến vị trí: " + str1.substring(9, 31));


        //Ghép chuỗi: dùng dấu cộng hoặc hàm concat
        //Ví dụ nếu 2 chữ dính liền thì thêm dấu space cho cuối câu đầu hoặc đầu câu sau, hoặc cộng thêm một chuỗi space
        System.out.println("-Nối chuỗi bằng dấu cộng: " +str1+" " +str2);
        System.out.println("-Nối chuỗi bằng concat: " + str1.concat("").concat(str2) );


        //ĐỘ dài chuỗi lenght
        System.out.println("-ĐỘ dài chuỗi str1: " + str1.length());

        //Tách chuỗi: dùng split -> trả về mảng
            //Cách 1:
        System.out.println("-Tách chuỗi - lấy giá trị thứ nhẩt: "+ str1.split(",")[0]); //Lấy giá trị đầu tiên sau khi tách chuỗi
        System.out.println("-Tách chuỗi - lấy giá trị thứ hai: "+ str1.split(",")[1]); //Lấy giá trị thứ 2 sau khi tách chuỗi
            //Loại bỏ khoảng trắng 2 đầu
        System.out.println("-Tách chuỗi - lấy giá trị thứ hai: "+ str1.split(",")[1].trim().toUpperCase());
            //Cách2:
        System.out.println("-Mảng lưu chuỗi vừa tách: "+ Arrays.toString(str1.split(",")));


        //-------------------//
        String str3 = "API testing with postman";
        String str4 = "API testing with postman Tool";
        String str5= "api testing with postman";

        //so sánh chứa: contains
        System.out.println("-So sánh chứa: " + str3.contains("postman"));
        System.out.println("-So sánh chứa: " + str3.contains("Selenium"));

        //So sánh bằng equals() phân biệt hoa thường
        System.out.println("-So sánh bằng: "+ str3.equals(str4));
        System.out.println("-So sánh bằng: "+ str3.equals("API testing with postman"));
        System.out.println("-So sánh bằng: "+ str3.equals(str5));
        System.out.println("-So sánh bằng bỏ qua phân biệt hoa thường: "+ str3.equalsIgnoreCase(str5));


        //Kiểm tra giá trị bắt đầu và kết thúc của một chuỗi : startwish endwish
        System.out.println("-Bắt đầu: "+ str3.startsWith("api"));
        System.out.println("-Kết thúc: "+ str3.endsWith("postman"));

        //Kiểm tra giá trị có null ko: isemty (nhận giá trị space)
        System.out.println("-Str3 Có rỗng ko: " + str3.isEmpty()); //isEmty nhận khoảng trống trong chuỗi
        //Ngược lại isBlank: kiểm tra giá trị rỗng, ko nhận giá trị space
        String str6= "  ";
        System.out.println("- Str6 có rỗng ko (tính giá trị space - ko xem space là rỗng): "+ str6.isEmpty());
        System.out.println("- Str6 có rỗng ko (ko tính giá trị space - xem space là rỗng): "+ str6.isBlank());
    }
}
