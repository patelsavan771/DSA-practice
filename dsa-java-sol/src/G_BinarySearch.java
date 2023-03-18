public class G_BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        int l = 0, h = n - 1, t;

        while(l <= h) {
            t = l + (h - l) / 2;
            if(arr[t] == k) {
                return t;
            } else if(arr[t] < k) {
                l = t + 1;
            } else {
                h = t - 1;
            }
        }
        return -1;
    }
}
