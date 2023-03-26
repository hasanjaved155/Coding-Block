package lec17;

public class Wrapper_Class { // wrapper class has memory in heap
    public static void main(String[] args) {
        Integer a = 10;
        int a1 = 10;
        System.out.println(a);// here address is not print because "tostring method" override here
        System.out.println(a1);

        int i = 189;
        Integer i1 = i;// auto boxing----> conversion of primitive to non-primitive corresponding to wrapper class
        System.out.println(i1);

        // unboxing-----> conversion of non-primitive to primitive datatype
        Integer l = 190;
        int l1 = l;
        System.out.println(l1);
        Long m = 1899l;
        long m1 = m;
        System.out.println(m1);

        //  Integer cache---- range(-128 to 127)
        Integer x = 19;
        Integer x1 = 19;

        Integer y = 781;
        Integer y1 = 781;

        System.out.println(x == x1);// true
        System.out.println(y == y1);// false because out of cache range

        // exception for character and character does not have concept of cache but it is mapping between range of cache
        char ch = 'a';
        char ch1 = 'a';
        System.out.println(ch == ch1);// here it's do mapping between cache range

        char ch2 = (char)234;
        System.out.println(ch2);
    }
}
