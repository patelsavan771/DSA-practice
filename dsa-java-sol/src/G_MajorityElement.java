import java.util.HashMap;
import java.util.Map;

public class G_MajorityElement {
    static int majorityElement(int a[], int size)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int v = 0;
        for(int i = 0; i < size; i++) {
            if(map.containsKey(a[i])) {
                v = map.get((Integer)a[i]);
                v++;
                if(v > size/2) {
                    return a[i];
                }
                map.replace(a[i], v);
            } else {
                map.put(a[i], 1);
            }
        }
        return -1;
    }
}
