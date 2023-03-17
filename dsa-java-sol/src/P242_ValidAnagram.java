public class P242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for(char c : s.toCharArray()) {
            arr[c - 97]++;
        }
        for(char c : t.toCharArray()) {
            arr[c - 97]--;
        }
        for(int i = 0; i < 26; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
