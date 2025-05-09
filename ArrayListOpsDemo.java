import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOpsDemo {
    public static void main(String[] args) {
        // 1) Create & add
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");          // ["Apple"]
        arr.add("Banana");         // ["Apple","Banana"]
        arr.add("Cherry");         // ["Apple","Banana","Cherry"]
        System.out.println("After add: " + arr);

        // 2) Insert at index
        arr.add(1, "Orange");      // ["Apple","Orange","Banana","Cherry"]
        System.out.println("After insert at 1: " + arr);

        // 3) Bulk addAll
        ArrayList<String> more = new ArrayList<>(Arrays.asList("Date", "Elderberry"));
        arr.addAll(more);          // ["Apple","Orange","Banana","Cherry","Date","Elderberry"]
        System.out.println("After addAll: " + arr);

        // 4) Access & modify
        String first = arr.get(0);       // "Apple"
        arr.set(2, "Blueberry");         // replace "Banana"
        System.out.println("Get(0): " + first);
        System.out.println("After set(2): " + arr);

        // 5) Remove by index & by value
        arr.remove(1);                   // removes "Orange"
        arr.remove("Date");              // removes first occurrence of "Date"
        System.out.println("After removals: " + arr);

        // 6) Query
        System.out.println("Size: " + arr.size());
        System.out.println("Contains Cherry? " + arr.contains("Cherry"));
        System.out.println("IndexOf Elderberry: " + arr.indexOf("Elderberry"));

        // 7) SubList (view!)
        ArrayList<String> sub = new ArrayList<>(arr.subList(1, 3));
        System.out.println("subList(1,3): " + sub);
        // Note: here we copy into a new ArrayList so modifications don't affect the original
        sub.set(0, "Blackberry");
        System.out.println("After modifying sub (copy): original=" + arr + ", sub=" + sub);

        // 8) Sort & reverse
        Collections.sort(arr);
        System.out.println("Sorted: " + arr);
        Collections.reverse(arr);
        System.out.println("Reversed: " + arr);

        // 9) Clear & isEmpty
        arr.clear();
        System.out.println("After clear, isEmpty? " + arr.isEmpty());
    }
}
