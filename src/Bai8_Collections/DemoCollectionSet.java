package Bai8_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollectionSet {
    public static void main(String[] args) {
        //Set - List -Map
        //khai bao kieu du lieu luu cung kieu
        // Set là cha nhưng khỏi tạo hash set là con

        //Khai báo kiểu Set với loại Hashset (ko có sắp xếp)
                //Set ko có thử tự ko được trùng
                // => áp dụng trong test lưu giá trị của driver, lưu id của từng tab trong trình duyệt
        System.out.println("KHAI BÁO SET");
        System.out.println("---hashset");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Summi");  //Khai bao kieu du lieu nao them vao kieu do
        stringSet.add("Kiwi");
        stringSet.add("Kiwi");
        stringSet.add("Kiwi123");

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("Summi"));

        for (String value : stringSet){
            System.out.println(value);
        }


        System.out.println("---treeset");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("125");
        treeSet.add("124");
        treeSet.add("123");
        treeSet.add("abc");
        treeSet.add("efgh");
        treeSet.add("aba");
        treeSet.stream().sorted();
        for (String value : treeSet){
            System.out.println(value);
        }
        System.out.println("KHAI BÁO LIST");


        //Hashset
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");
    }
}
