package leetcode;

import java.util.Scanner;

public class Can_Place_Flower {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] flowerbed = new int[n];
        for (int i = 0; i < n; i++) {
            flowerbed[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(canPlaceFlowers(flowerbed,k));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int k) {
        int count = 0;
        if(flowerbed.length == 1){
            if(flowerbed[0] == 1 && k == 0)return true;
            else if(flowerbed[0] == 0) return true;
            else return false;
        }
        for(int i = 0; i < flowerbed.length; i++){
            if(i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                count++;
                flowerbed[i] = 1;
                if(count >= k)break;
            }else if(i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0){
                count++;
                flowerbed[i] = 1;
                if(count >= k)break;
            }
        }
        for(int i = 1; i < flowerbed.length - 1; i++){
            if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                count++;
                flowerbed[i] = 1;
                if(count >= k)break;
            }
        }
        if(count >= k)return true;

        return false;
    }
}