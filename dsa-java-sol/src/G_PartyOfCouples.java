import java.util.HashMap;
import java.util.Map;

public class G_PartyOfCouples {
    static int findSingle(int N, int arr[]){
        Map map = new HashMap<Integer, Integer>();
        int j;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.remove(arr[i]);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Object i : map.keySet())
            return (int) i;
        return -1;
    }
}
