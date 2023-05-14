package lec35_Inheritance;

public class C extends P {// inheritance
    int d = 2;
    int d2 = 20;

    @Override
    public void fun(){
        System.out.println("Fun In C");
    }
    public void fun2(){
        System.out.println("Fun2 In C");
    }
}
