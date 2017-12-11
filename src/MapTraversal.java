import java.util.Iterator;
import java.util.Map;

/**
 * Author: Qi Huang
 * Date: 2017/12/11
 * Purpose: Three ways to traverse map
 */
public class MapTraversal {

    // both key and value are needed
    public void method1(Map<Integer, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + entry.getValue());
            }
        }
    }

    // only need key or value
    public void method2(Map<Integer, String> map) {
        if (!map.isEmpty()) {
            for (Integer integer : map.keySet()) {
                System.out.println(integer);
            }

            for (String s : map.values()) {
                System.out.println(s);
            }
        }
    }

    // use iterator, can remove entry during traversal
    public void method3(Map<Integer, String> map) {
        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println(entry.getKey() + entry.getValue());
            entries.remove();
        }
    }
}
