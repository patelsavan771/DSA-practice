import java.util.HashMap;
import java.util.Map;

public class P205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();

        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if(map.containsValue(t.charAt(i))) {
                return false;
            }

            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

//    public static boolean isIsomorphic(String s, String t) {
//        String temp = s;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '_') continue;
//            t = t.substring(0, i) + t.substring(i).replace(t.charAt(i), s.charAt(i));
//            s = s.replace(s.charAt(i), '_');
//            System.out.println(t);
//        }
//        return temp.equals(t);
//    }
}
