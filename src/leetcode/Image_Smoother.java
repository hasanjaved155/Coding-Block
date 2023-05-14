package leetcode;

public class Image_Smoother {
    public static void main(String[] args) {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};

        int[][] ans = imageSmoother(img);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] imageSmoother(int[][] img) {
        int[][] arr = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                 int count = 0;
                for (int row = i - 1; row <= i + 1 ; row++) {
                    for (int col = j - 1; col <= j + 1 ; col++) {
                        if (row >= 0 && col >= 0 && row < img.length && col < img[0].length){
                            arr[i][j] = arr[i][j] + img[row][col];
                            count++;
                        }
                    }
                }
                arr[i][j] = arr[i][j] / count;
            }
        }
        return arr;
    }
}
