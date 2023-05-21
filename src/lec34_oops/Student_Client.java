package lec34_oops;

public class Student_Client {
    public static void main(String[] args) {
        System.out.println("hello world");
                               // non static method
        // non static method call during object creation and accessed by method name
        // non static method can access static variable as well as instance variable
        Student s = new Student();
        Student s1 = new Student();
        s.name = "Javed";
        s.age = 23;
        s1.name = "Ashim";
        s1.age = 20;
        s.Introduction();
        s1.Introduction();
        String str = "Jack";
        s.SayHey(str);
        s.yoo("Sparrow");
        s1.yoo("Sparrow");

                             // static method
        // static method call during class loading and accessed by class name
        // static method can access static variable but can not access instance variable
        Student.Say(str);
    }
}
