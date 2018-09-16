import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tien", 24);
        hashMap.put("Long", 25);
        hashMap.put("TuanAnh", 24);
        hashMap.put("Truong", 22);
        System.out.println("Display entries in HashMap:");
        System.out.println(hashMap+"\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Tien", 24);
        linkedHashMap.put("Long", 25);
        linkedHashMap.put("TuanAnh", 24);
        linkedHashMap.put("Truong", 22);
        System.out.println("\nThe age for " + "Tuan Anh is: " + linkedHashMap.get("TuanAnh"));
    }
}
