public class P1299_Replace_ElementsWithGreatestElementOnRight {
    public int[] replaceElements(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == max) {
                max = arr[i + 1];
                for (int j = i + 2; j < arr.length; j++) {
                    if(arr[j] > max) max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
