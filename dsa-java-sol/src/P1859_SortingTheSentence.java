public class P1859_SortingTheSentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] arrr = new String[arr.length];
        for(String s1 : arr) {
            int i = Integer.parseInt(s1.charAt(s1.length() - 1) + "");
            arrr[i - 1] = s1.substring(0, s1.length() - 1);
        }
        String result = "";
        for(String s1 : arrr) {
            result = result + " " + s1;
        }
        return result.trim();
    }
}
