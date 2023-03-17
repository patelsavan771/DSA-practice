public class P20_ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        char[] arr = new char[s.length() + 1];
        arr[1] = s.charAt(0);
        int top = 1;

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c - arr[top] > 0 && c - arr[top] < 3) {
                top--;
            }
            else {
                arr[++top] = c;
            }
        }
        if(top == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
