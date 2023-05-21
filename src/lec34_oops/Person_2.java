package lec34_oops;

public class Person_2 {
    public static void main(String[] args) {
        // constructor with out parameter
        //Person s = new Person();
        // constructor with parameter
        Person s = new Person("javed",22);
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
