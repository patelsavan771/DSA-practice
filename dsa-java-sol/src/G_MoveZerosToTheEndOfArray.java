public class G_MoveZerosToTheEndOfArray {
    void pushZerosToEnd(int[] arr, int n) {
        if(n == 0) return;

        int j = 0;

        //for finding first zero
        while(j < n && arr[j] != 0) {
            j++;
        }

        for (int i = j + 1; i < n; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
    }
}
