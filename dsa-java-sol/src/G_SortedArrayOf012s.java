public class G_SortedArrayOf012s {
    public static void sort012(int arr[], int n)
    {
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                a++;
            } else if(arr[i] == 1) {
                b++;
            } else {
                c++;
            }
        }
        int i = 0;
        while(a > 0) {
            arr[i] = 0;
            i++;
            a--;
        }
        while(b > 0) {
            arr[i] = 1;
            i++;
            b--;
        }
        while(c > 0) {
            arr[i] = 2;
            i++;
            c--;
        }
    }
}
