import java.util.ArrayList;

public class G_UnionOfTwoSortedArrray {
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0;
        int j = 0;
        int li = -1;

        while(i < n && j < m) {
            if(li == arr1[i]) {
                i++;
            } else if(li == arr2[j]) {
                j++;
            } else {
                if(arr1[i] < arr2[j]) {
                    l.add(arr1[i]);
                    li = arr1[i];
                    i++;
                } else if(arr1[i] > arr2[j]) {
                    l.add(arr2[j]);
                    li = arr2[j];
                    j++;
                } else {
                    l.add(arr1[i]);
                    li = arr1[i];
                    i++;
                    j++;
                }
            }
        }
        while(i < n) {
            if(arr1[i] != li) {
                l.add(arr1[i]);
                li = arr1[i];
            }
            i++;
        }while(j < m) {
            if(arr2[j] != li) {
                l.add(arr2[j]);
                li = arr2[j];
            }
            j++;
        }
        return l;
    }
}
