public class P1189_MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for(int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a']++;
        }

        int c = 0;
        while(true) {
            arr[1]--;
            arr[0]--;
            arr['l' - 'a'] -= 2;
            arr['o' - 'a'] -= 2;
            arr['n' - 'a']--;

            if(arr[1] < 0 || arr[0] < 0 || arr['l' - 'a'] < 0 || arr['o' - 'a'] < 0 || arr['n' - 'a'] < 0 ) {
                break;
            } else {
                c++;
            }
        }
        return c;
    }
}
