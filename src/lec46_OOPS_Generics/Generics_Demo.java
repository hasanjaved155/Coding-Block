package lec46_OOPS_Generics;

class Pair<K,P> {
    K x;
    P y;

    public void display(){
        System.out.println(x + " " + y);
    }
}

public class Generics_Demo{
    public static void main(String[] args) {
        Pair<Integer,String>p = new Pair<>();
        p.x = 90;
        p.y = "Ashim";
        p.display();
    }
}
