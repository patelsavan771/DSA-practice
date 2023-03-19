import java.util.HashSet;
import java.util.Set;

public class P929_UniqueEmail {
    public static int numUniqueEmails(String[] emails) {
        String user;
        int i;
        Set s = new HashSet<String>();

        for(String email : emails) {
            user = email.substring(0, email.indexOf('@'));
            i = -1;
            i = user.indexOf('+');
            if(i > 0) {
                user = user.substring(0, i);
            }
            s.add(user.replace(".", "") + email.substring(email.indexOf('@')));
        }
        return s.size();
    }

    public static void main(String[] args) {
        String[] arr = {"test.emal+alex@leetcode.com","test.e.ail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int i = numUniqueEmails(arr);
        System.out.println(i);
    }
}
