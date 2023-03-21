public class G_StockBuySell {
    public void stockBuySell(int[] price, int n) {
        // search for first buy price
        int l = 0;
        int h = 0;
        boolean flag = true;

        for(int i = 1; i < n; i++) {
            if(price[i] > price[h]) {
                h = i;
            }
            else if(price[i] < price[h]) {
                // sell current holding
                if(h != l) {
                    System.out.print("(" + l + " " + h + ") ");
                    flag = false;
                    l = h = i;
                }
                else {
                    l = h = i;
                }
            }
        }
        if(h != l) {
            System.out.print("(" + l + " " + h + ") ");
            flag = false;
        }
        if(flag) {
            System.out.print("No Profit");
        }
        System.out.print("\n");


    }
}
