import java.util.Arrays;

public class P1385_FindtheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for(int i = 0; i < arr1.length; i++) {
            if(checkRange(arr2, arr1[i] - d, arr1[i] + d)) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkRange(int[] arr, int from, int to) {
        int low = 0;
        int high = arr.length;

        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= from && arr[mid] <= to) {
                return false;
            }
            else if(arr[mid] < from) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return true;
    }
}
