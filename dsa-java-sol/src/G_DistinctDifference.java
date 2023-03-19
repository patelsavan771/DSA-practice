import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class G_DistinctDifference {
    public static ArrayList<Integer> getDistinctDifference(int n, int[] a) {
        Map l = new HashMap<Integer, Integer>();
        Map r = new HashMap<Integer, Integer>();
        ArrayList<Integer> arr = new ArrayList<>();
        int x;

        for(int i = 1; i < n; i++) {
            if(r.containsKey(a[i])) {
                r.replace(a[i], (int)r.get(a[i]) + 1);
            } else {
                r.put(a[i], 1);
            }
        }
        arr.add(0 - r.size());
        for(int i = 1; i < n; i++) {
            if(l.containsKey(a[i - 1])) {
                l.replace(a[i - 1], (int)l.get(a[i - 1]) + 1);
            } else {
                l.put(a[i - 1], 1);
            }

            if((int)r.get(a[i]) == 1) {
                r.remove(a[i]);
            } else {
                r.replace(a[i], (int)r.get(a[i]) - 1);
            }
            arr.add(l.size() - r.size());
        }
        return arr;
    }
}
