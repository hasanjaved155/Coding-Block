package lec19;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 15;
        if ((n & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
