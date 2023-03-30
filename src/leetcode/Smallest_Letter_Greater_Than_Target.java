package leetcode;

public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] arr = {'c','d','e'};
        char target = 'f';

        System.out.println(nextGreatestLetter(arr,target));

    }

    private static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
}
