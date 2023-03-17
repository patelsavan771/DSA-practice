import java.util.HashMap;

public class P1_AddSum {
    public static void main(String[] args) {

    }
    // 3 ms, faster than 86.72% of Java online submissions for Two Sum.
    // using hashmap
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int[] arr = {i, map.get(nums[i])};
                return arr;
            }
            map.put(target- nums[i], i);
        }
        return null;
    }
// using bruteforce
//    public int[] twoSum(int[] nums, int target) {
//
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target) {
//                    int[] result = {i,j};
//                    return result;
//                }
//            }
//        }
//        return null;
//    }
}
