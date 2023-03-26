package lec_34_oops;

public class Person_2_Encapsulation {
    public static void main (String[] args) throws Exception {
        Person_Encapsulation s = new Person_Encapsulation();
        s.setAge(-90);
        System.out.println(s.getAge());
        s.setName("Jack");
        System.out.println(s.getName());
    }
}
