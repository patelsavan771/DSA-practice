public class G_TexiBooking {
    public static int minimumTime(int n, int cur, int[] pos, int[] time) {
        if(n < 1) return -1;
        int min = Math.abs(cur - pos[0]) * time[0];
        int x;
        for(int i = 1; i < n; i++) {
            x = Math.abs(cur - pos[i]) * time[i];
            if(x < min) {
                min = x;
            }
        }
        return min;
    }
}
