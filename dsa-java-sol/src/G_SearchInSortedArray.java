public class G_SearchInSortedArray {
    static int searchInSorted(int arr[], int n, int k) {
        int low = 0;
        int high = n - 1;
        int t;
        while(low <= high) {
            t = low + (high - low) / 2;
            if(k == arr[t]) {
                return 1;
            } else if(k > arr[t]) {
                low = t + 1;
            }else {
                high = t - 1;
            }
        }
        return -1;
    }
}
