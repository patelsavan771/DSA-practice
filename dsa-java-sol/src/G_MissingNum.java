public class G_MissingNum {
    public static int missingNumber(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int sumOfN = n * (n + 1) / 2;
        return sumOfN - sum;
    }
}
