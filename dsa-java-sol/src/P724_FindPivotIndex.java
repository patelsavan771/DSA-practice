public class P724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int ls = 0;
        int rs = 0;
        for(int i = 0; i < nums.length; i++) {
            rs += nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            rs -= nums[i];
            if(rs == ls) {
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}
