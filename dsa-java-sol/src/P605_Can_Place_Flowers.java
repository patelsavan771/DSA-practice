public class P605_Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        if(flowerbed.length == 1 && flowerbed[0] == 0) {
            return true;
        }
        if(flowerbed.length >= 2) {
            if(flowerbed[0] == 0 && flowerbed[1] == 0) {
                c++;
                flowerbed[0] = 1;
            }
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if(flowerbed[i]  == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                c++;
                flowerbed[i] = 1;
            }
        }
        if(flowerbed.length >= 2) {
            if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                c++;
            }
        }
        return n <= c;
    }
}
