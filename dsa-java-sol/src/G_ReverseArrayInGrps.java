import java.util.ArrayList;

public class G_ReverseArrayInGrps {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int l = 0;
        int h = k - 1;
        while(h < n) {
            reverse(arr, l, h);
            l = h + 1;
            h += k;
        }
        reverse(arr, l, n - 1);
    }

    void reverse(ArrayList<Integer> arr, int l, int h) {
        int t;
        while(l < h) {
            t = arr.get(l);
            arr.set(l, arr.get(h));
            arr.set(h, t);
            l++;
            h--;
        }
    }
}
