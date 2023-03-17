public class P2042_CheckifNumbersAreAscendinginaSentence {
    public boolean areNumbersAscending(String s) {
        boolean flag = true;
        String[] sarr = s.split(" ");

        int current = 0;
        int previous = -1;
        for( String s1 : sarr) {
            if(s1.charAt(0) < 65) {
                previous = current;
                current = Integer.parseInt(s1);
                if(current <= previous) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
