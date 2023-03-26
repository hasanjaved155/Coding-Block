package lec_34_oops;

public class Person {
    int age;
    String name;

    // constructor without parameter

//    public Person() {
//        this.name = "javed";
//        this.age = 20;
//    }


    // constructor with parameter
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
