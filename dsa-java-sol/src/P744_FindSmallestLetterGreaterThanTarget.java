public class P744_FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int result = -1;
        if(target == 'z' || target < letters[0]) {
            return letters[0];
        }


        while(low < high) {
            int mid = low + (high - low)/2;

            if(letters[mid] == target) {
                result = mid + 1;
                break;
            }
            else if(letters[mid] > target) {
                high = mid - 1;
                result = mid;
            }
            else {
                low = mid + 1;
                result = mid + 1;
            }
        }
        return letters[result];
    }
}
