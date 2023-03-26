package lec_oops;

public class Student {
    String name;// instance variable
    int age;// instance variable

    public void Introduction(){
        System.out.println("My name is "+name+" and age is "+ age);
        //System.out.println("My name is "+this.name+" and age is "+ this.age);
    }

    public void SayHey(String str) {
        System.out.println(str);
    }
    public static void Say(String str) {
        System.out.println(str);
    }

    public void yoo(String name) {
        System.out.println(this.name + " "+ name);
        // System.out.println(name + " "+ str);
        // by the help of "this" method we can access instance variables
    }
}
