public class P162_FindPeakElement {
    public int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while(low < high) {
            int mid = low + ((high - low) / 2);

            if(arr[mid] > arr[mid + 1]) {
                // left side
                high = mid;
            }
            else {
                // right side
                low = mid + 1;
            }
        }
        return low;
    }

}
