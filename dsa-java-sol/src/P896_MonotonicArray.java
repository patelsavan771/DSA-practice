public class P896_MonotonicArray {
    public boolean isMonotonic(int[] arr) {
        boolean increasing = false;
        boolean decreasing = false;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] > arr[i]) {
                decreasing = true;
            }
            if(arr[i - 1] < arr[i]) {
                increasing = true;
            }
        }
        return decreasing && increasing ? false : true;
    }
}
