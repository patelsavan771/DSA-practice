public class P496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max, j;

        for(int i = 0; i < nums1.length; i++) {

            j = nums2.length - 1;
            max = -1;
            while(j >= 0 && nums1[i] != nums2[j]) {
                if(nums2[j] > nums1[i]) {
                    max = nums2[j];
                }
                j--;
            }
            nums1[i] = max;
        }
        return nums1;
    }

//    below one is good:
//
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int max, j;
//
//        for(int i = 0; i < nums1.length; i++) {
//
//            j = 0;
//            while(nums2[j] != nums1[i]) {
//                j++;
//            }
//            max = -1;
//            for(int k = j + 1; k < nums2.length; k++) {
//                if(nums2[k] > nums1[i]) {
//                    max = nums2[k];
//                    break;
//                }
//            }
//            nums1[i]  = max;
//        }
//        return nums1;
//    }
}
