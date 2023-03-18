import java.util.HashMap;
import java.util.Map;

public class G_FirstToOccureKTimes {
    public int firstElementKTime(int[] a, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int j;
        for(int i = 0; i < n; i++) {
            if(map.containsKey(a[i])) {
                j = map.get(a[i]) + 1;
                if(j == k) return a[i];
                map.replace(a[i], j);
            } else {
                map.put(a[i], 1);
            }
        }
        return -1;
    }
}
