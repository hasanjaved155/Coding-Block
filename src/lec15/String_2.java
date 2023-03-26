package lec15;

public class String_2 {
    public static void main(String[] args) {
        String s = "hello";
        s = s + "bye";
        System.out.println(s);
        String s1 = new String("hello");
        s1 = s1 + "bye";
        System.out.println(s1);

        String s2 = "hello" + "bye";
        String s3 = "hello" + "bye";
        System.out.println(s2 == s3);
    }
}
