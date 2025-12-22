package Bai8_Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //Không thứ tự truy xuất theo key

        //Ánh xạ theo kiểu key value nên khi bao báo kiểu dữ liệu phải có 2 tham số
        Map<String, String> map = new HashMap<>();
        //Triển khai theo dạng cụ thể ko dùng add nữa mà dùng map
        map.put("name", "Summi");
        map.put("age", "20");
        map.put("address", "Can Thơ");
        map.put("address","Dong Thap");

        //truy xuất giá trị thông qua Key
        System.out.println(map.get("name"));
        //Duyệt map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
