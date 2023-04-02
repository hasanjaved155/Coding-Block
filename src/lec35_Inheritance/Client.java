package lec35_Inheritance;

public class Client {
    public static void main(String[] args) {
        // Case 1
        P obj = new P();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        obj.fun();
        obj.fun1();
    }
}
