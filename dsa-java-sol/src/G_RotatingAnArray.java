public class G_RotatingAnArray {
    void leftRotate(int[] arr, int n, int d) {
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    void reverse (int[] arr, int low, int high) {
        int temp;
        while( low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
