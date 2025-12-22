package Bai8_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {

        //List chứa phần tử trùng lặp, có thứ tự vị trí
        List<Integer> listNum = new ArrayList<>();
        listNum.add(12);
        listNum.add(14);
        listNum.add(17);
        listNum.add(20);
        listNum.add(15);

        listNum.remove(2);
        System.out.println("==TRUY XUAT DONG LOAT CAC GIA TRI==");
        for (int value : listNum){
            System.out.println(value);
        }
        System.out.println("==TRUY XUAT THONG QUA VI TRI CU THE==");
        System.out.println(listNum.get(3));

        //LinkedList
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("https://drive.google.com/file/d/1SpN7tGWfVBKxYg1o-oiSthw5u8vvjMS9/view");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");


    }
}
