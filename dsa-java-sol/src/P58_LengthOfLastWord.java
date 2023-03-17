public class P58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.lastIndexOf(' ');
        if(i == -1) {
            return s.length();
        }
        else {
            return s.length() - i;
        }
    }
}
