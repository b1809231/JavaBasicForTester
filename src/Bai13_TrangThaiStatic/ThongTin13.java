package Bai13_TrangThaiStatic;

public class ThongTin13 {

    public void getInfo(){
        DemoBienStatic demobienstatic1 = new DemoBienStatic();
        System.out.println(demobienstatic1.className);

        DemoBienStatic demobienstatic2 = new DemoBienStatic();
        System.out.println(demobienstatic2.className);

        // taọ 1 đối tượng - sau đó dù ko gợi ý class name vẫn gọi nó đc
        //Ví dụ như tên trường là tên chung của các hs trong trường, ko thuộc hs nào
        //Nhưng khi giứoi thiệu từng sinh viên thì có thể giứoi thiệu trường mình học
    }
    public static void main(String[] args) {
        //cách gọi biến static nên lấy tên class.tên biến
        System.out.println(DemoBienStatic.className);
        //System.out.println(DemoBienStatic.name); //Lỗi ko gọi đc do nó kb biến static
    }
}
