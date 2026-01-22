package Bai14_KeThuaVaDongGoi.DongGoi;

public class Student {
    //Đóng gói trong java
    //Biến pvtc private
    //Hàm pvtc public
    // gồm có các hàm get và set gán trị cho các biến
    // để gán giá trị cho các biến chúng ta dùng set haowjc truyền vào hàm xây dựng
    private String name;
    private int age;
    private String birthday;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
