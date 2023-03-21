import java.util.ArrayList;

public class G_AlternatePosNegNumbers {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }
        boolean p = true;
        int pi = 0;
        int ni = 0;
        int val = -111;
        for(int i = 0; i < n; i++) {
            if(p) {
                if(pos.size() > 0) {
                    val = pos.remove(0);
                    p = false;
                } else {
                    while(i < n) {
                        arr[i] = neg.remove(0);
                        i++;
                    }
                    break;
                }

            } else if(!p) {
                if(neg.size() > 0) {
                    val = neg.remove(0);
                    p = true;
                } else {
                    while(i < n) {
                        arr[i] = pos.remove(0);
                        i++;
                    }
                    break;
                }
            }
            arr[i] = val;
        }
    }
}
