public class P367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        // 1 1 = 1
        // 2 4 = 1 + 3
        // 3 9 = 1 + 3 + 5
        // 4 16 = 1 + 3 + 5 + 7
        // n nn = 1 + 3 + 5 + ... + (2n - 1)

        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return  num == 0;
    }
}
