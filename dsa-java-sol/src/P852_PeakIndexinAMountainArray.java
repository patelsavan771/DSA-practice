public class P852_PeakIndexinAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 1;
        while(arr[i] > arr[i - 1]) {
            i++;
        }
        return i - 1;
    }
}
