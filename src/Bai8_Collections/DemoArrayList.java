package Bai8_Collections;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {
    public static void main(String[] args) {

        //Cách 1 khai báo trực tiếp thông qua th cha
        List<String> list = new ArrayList<>();

        //Cách khai báo thứ 2 - lấy trực tiếp loai của thằng con để khai báo
        //ArayList, Vector, LinkedList...
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("C#");
        arrayList.add(".net");
        arrayList.add("C++");

        System.out.println("Kích cở của arayList: " + arrayList.size());
        System.out.println("Có rỗng ko: " + arrayList.isEmpty());
        System.out.println("Vị trí đầu tiên tìm thấy phần thử: " + arrayList.indexOf("Python"));
        System.out.println("Vị trí cuối cùng tìm thấy phần thử: " + arrayList.lastIndexOf("P"));
        System.out.println("Có chứa phần tử trong mảng ko: " + arrayList.contains(".net"));

        arrayList.remove(5);
        System.out.println("------các phần tử sau khi xoá:------");
        for(String value : arrayList){
            System.out.println(value);
        }

        System.out.println("Cập nhật giá trị ở vị trí thứ 4: " +arrayList.set(4, "ML"));
        System.out.println("Lấy giá trị vừa cập nhật ở vị trí thứ 4: " + arrayList.get(4));

        //tuỳ theo phiên bản jdk có thể khai báo theo kiểu nào
        //object là từ khoá đại diện kiểu dữ liệu cho tất cả
        //Gồm string, int, long, float.....
        //Nếu jdk dứoi 10 thì ko có var
        var arrayList2 = new ArrayList<>(); //chưa biết đc arrL2 này là int hay string hay đó
        arrayList2.add(1);
        arrayList2.add("oop");
        //duyệt arraylist2
        System.out.println("-----------Duyệt arrayList2--------");
        for(Object value : arrayList2){
            System.out.println(value);
        }

        //khai báo theo kiểu object cho araylist
        ArrayList<Object> arrayList3 = new ArrayList<>();
        arrayList3.add("Selenium");
        arrayList3.add("Appium");
        arrayList3.add(8888);
        arrayList3.add(12.5);
        System.out.println("-----------Duyệt arrayList3--------");
        for(Object value : arrayList3){
            System.out.println(value);
        }


    }

}
