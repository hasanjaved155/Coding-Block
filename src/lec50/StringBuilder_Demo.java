package lec50;

public class StringBuilder_Demo {
    public static void main(String[] args) {
        //string_Demo();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());// by default capacity is 16
        sb.append("Hey");
        sb.append('a');
        sb.append(1);
//        sb.append(true);
//        sb.append(new int[4]);
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        sb.append("hellohelloo");
        System.out.println(sb.length());
        sb.append('s');
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(1,3));
        String s = sb.toString();
        System.out.println(s);
        StringBuilder sb1 = new StringBuilder(s);
        stringBuilder_Demo();
        string_Demo();
    }

    private static void stringBuilder_Demo() {
     StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }

    private static void string_Demo() {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
        System.out.println(s);
    }
}
