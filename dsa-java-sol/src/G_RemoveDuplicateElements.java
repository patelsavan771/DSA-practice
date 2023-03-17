public class G_RemoveDuplicateElements {
    static int remove_duplicate(int arr[],int n){
        if(n == 0) {
            return 0;
        }
        int j = 0;
        int temp;
        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
        int res = remove_duplicate(arr, arr.length);
        System.out.println(res);


    }
}
