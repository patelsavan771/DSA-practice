public class P2124_CheckifAllAsAppearsBeforeAllBs {
    public boolean checkString(String s) {

        return !s.contains("ba");

//        int l = 0;
//        int h = s.length() - 1;
//
//        while(l < s.length() && s.charAt(l) == 'a') {
//            l++;
//        }
//        while ( h >= 0 && s.charAt(h) == 'b') {
//            h--;
//        }
//        if(l > h) {
//            return true;
//        }
//        else {
//            return false;
//        }



//        boolean flag = true;
//        char c = s.charAt(0);
//
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) > c) {
//                c = s.charAt(i);
//            }
//            else if(s.charAt(i) < c) {
//                flag = false;
//                break;
//            }
//        }
//        return flag;
    }
}
