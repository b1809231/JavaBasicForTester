package Bai14_KeThuaVaDongGoi.KeThua;

public class Student extends Person{

//    Trong phương thức khởi tạo Student, ta sẽ dùng từ khóa super
//    để cho lớp con truy cập các những thứ liên quan đến lớp cha.
//    Như ví dụ trên thì ta dùng super(name, age, height)
//    để gọi phương thức khởi tạo lớp cha.
//    Chổ này BẮT BUỘC phải như vậy vì trong Java quy định.


    /**
     *class con dùng từ khoá extends để kế thừa từ class cha
     * Class con phải có hàm xây dựng giống với cấu trúc từ class cha
     * Bắt buộc dùng HÀM super() để truyền tham số từ hàm xây dựng vào
     * Để sd toàn quyền từ class cha pvtc phải để toàn public
     * **/


    /**
     * từ khoá super dùng:
     * gọi contructor super()
     * gọi hàm từ class cha super.method()
     * gọi biến từ class cha super.value
     */

    private String phone;
    private String address;


    public Student(String name, int age, float height, String phone, String address) {
        super(name, age, height); // Đảm boả đúng cấu trúc ở class cha
        // duới này khai báo cái muốn thêm vào
        this.phone = phone; //nếu biến ở hàm này khác tên biến thì ko cần từ khoá this
        this.address = address;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){

        super.getInfo(); //Gọi hàm từ class cha sang class con
        return address;
    }


    /*Khi hàm ở class con giống hàm class cha thì
    nó sẽ lấy hàm ở class con, ko hiểu hàm class cha nữa
    => xảy ra GHI ĐÈ
     */
    public void getInfo(){
        System.out.println("Phone:" + phone);
        System.out.println("Address:" + address);

    }

    public static void main(String[] args) {
        Student st = new Student("Linh", 30, 1.65f,"48357", "Can Tho");
        st.getInfo();

    }

}
