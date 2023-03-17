public class P2210_CountHillsAndValleysInAnArray {
    public int countHillValley(int[] arr) {
        int count = 0;
        int l, r;
        boolean flag;

        for(int i = 1; i < arr.length - 1; i++) {
            flag = false;
            l = i - 1;
            r = i + 1;
            while(arr[i] == arr[l]) {
                if(l > 0) {
                    l--;
                }
                else {
                    break;
                }
            }
            while(arr[i] == arr[r]) {
                if(r < arr.length - 2) {
                    r++;
                    flag = true;
                }
                else {
                    break;
                }
            }

            if((arr[i] > arr[l] && arr[i] > arr[r]) || (arr[i] < arr[l] && arr[i] < arr[r])) {
                count++;
                if(flag) {
                    i = r - 1;
                }
            }
        }
        return count;
    }
}
