public class P66_PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};

        for (int i:plusOne(arr) ) {
            System.out.println(i + ", ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int carry = 9;
        for(int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if(digits[i] > 9) {
                carry = digits[i] / 10;
                digits[i] = digits[i] % 10;
            }
            else {
                carry = 0;
                break;
            }
        }
        if(carry == 0) {
            return digits;
        }
        else {
            int[] arr = new int[digits.length + 1];
            arr[0] = carry;
            for(int i = 0; i < digits.length; i++) {
                arr[i + 1] = digits[i];
            }
            return arr;
        }

    }
}
