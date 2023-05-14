package lec35_Inheritance;

public class Client {
    public static void main(String[] args) {
        // Case 1
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        // Case 2
//        P obj = new C();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(((C) obj).d2);type casting to access C
//        System.out.println(((C) obj).d);type casting to access C
//        obj.fun();// output in runtime that why C is running// method overriding
//        obj.fun1();
//        ((C) obj).fun2();

        // Case 3
//        C obj = new P();// not allow


        // Case 4
        C obj = new C();
        System.out.println(((P) obj).d);// type casting to access P
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        obj.fun();
        obj.fun1();
        obj.fun2();
    }
}
