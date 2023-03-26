package stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Javed<String> x = new Javed<>();


        x.push("a");
        x.push("b");
        x.push("c");

//        System.out.println(x);

        while (!x.empty()){
            System.out.println(x.peek());
            x.pop();
        }

    }
}
