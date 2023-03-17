import java.util.ArrayList;
import java.util.List;

public class P118_PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>(numRows);
        ArrayList<Integer> rowOne = new ArrayList<>();
        rowOne.add(1);
        l.add(rowOne);
        for(int i = 2; i <= numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i - 1; j++) {
//                System.out.println((l.get(i - 2)).get(j - 1) + (l.get(i - 2)).get(j));
                row.add(l.get(i - 2).get(j - 1) + l.get(i - 2).get(j));
            }
            row.add(1);
            l.add(row);
        }
        return l;
    }

    public static void main(String[] args) {
        List<List<Integer>> l = generate(5);
        System.out.println(l.size());
        for(int i = 0; i < l.size(); i++) {

        }
    }
}
