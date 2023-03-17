import java.util.Scanner;

public class BestCupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int dis = n / 10;
            System.out.println(dis > 100 ? dis : 100);
        }
    }
}
