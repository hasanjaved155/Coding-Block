package lec35_Inheritance;

public class Sum {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2,4,8));
        System.out.println(add(2,4,0.5f));
        System.out.println(add(2,3,4,4,5,6,6,6,6,6,6,6,6,6,6,6,1));
    }

    private static int add(int a, int b) {
        return a + b;
    }
    private static int add(int a, int b, int c) {
        return a + b + c;
    }
    private static int add(int a, int b,float c) {
        return (int) (a + b + c);
    }
    private static int add(int x,int... a){// three dot variable behave like array
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
