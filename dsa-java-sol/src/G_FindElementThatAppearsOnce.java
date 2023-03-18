public class G_FindElementThatAppearsOnce {
    public static int search(int[] a, int n) {
        for(int i = 1; i < n; i += 2) {
            if(a[i] != a[i - 1]) {
                return a[i - 1];
            }
        }
        return a[n - 1];
    }
}
