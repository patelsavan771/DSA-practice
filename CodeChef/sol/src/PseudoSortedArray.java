import java.util.Scanner;

public class PseudoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int flag = 0;
            int temp;
            for(int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[j] > arr[k]) {
                        temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                        flag++;
                    }
                }
            }
            if(flag > 1) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }

}
