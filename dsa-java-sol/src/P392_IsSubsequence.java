public class P392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        for(int i = 0; i < t.length() && p < s.length(); i++) {
            if(t.charAt(i) == s.charAt(p)) {
                p++;
            }
        }
        return p == s.length();
    }
}
