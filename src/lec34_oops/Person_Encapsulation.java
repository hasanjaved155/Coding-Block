package lec34_oops;

public class Person_Encapsulation {
    private String name;
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception{
        if (age < 0) {
            throw new Exception("Ae Baklol Age Kabhi Negative Nahi Hoti");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
