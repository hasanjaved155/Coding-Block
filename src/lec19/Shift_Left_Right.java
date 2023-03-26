package lec19;

import org.w3c.dom.ls.LSOutput;

public class Shift_Left_Right {
    public static void main(String[] args) {
        float f = 10.2f;
        //int i = (int) f;
        int x = 15;
        // right shift(/2)
        System.out.println(x >> 1);
        int a = -21;
        System.out.println(a >> 1);
        // left shift(*2)
        System.out.println(x << 1);
        System.out.println(a << 1);
    }

}
