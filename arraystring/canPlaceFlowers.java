package arraystring;

public class canPlaceFlowers {
    public static boolean cpf(int[] flowerbed, int n) {
        int count = n;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftEmpty = (i == 0 || flowerbed[i-1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i+1] == 0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    count--;

                    if(count == 0) return true;
                }
            }
        }
        return count <= 0;
    }
}
