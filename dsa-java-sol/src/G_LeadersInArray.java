import java.util.ArrayList;

public class G_LeadersInArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        if(n == 0) return null;

        ArrayList<Integer> l = new ArrayList<>();
        l.add(arr[n - 1]);
        int max = arr[n - 1];
        int i = n - 2;

        while(i >= 0) {
            if(arr[i] >= max) {
                max = arr[i];
                l.add(max);
            }
            i--;
        }
        for (i = 0; i < l.size() / 2; i++) {
            Integer temp = l.get(i);
            l.set(i, l.get(l.size() - i - 1));
            l.set(l.size() - i - 1, temp);
        }
        return l;
    }
}
