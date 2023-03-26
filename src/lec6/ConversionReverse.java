package lec6;

public class ConversionReverse {
    public static void main(String[] args) {

        String st = "26";
        int base = 1;
        int ans = 0;

        for (int i = st.length()-1; i >= 0; i--) {
            String digit = String.valueOf(st.charAt(i));// char to string

            int digit2 = Integer.parseInt(digit);//string to num
            int chunk = base*digit2;
            ans = ans+chunk;

            System.out.println("digit "+digit2+" base "+base+" chunk "+chunk+" ans "+ans);

            base = base*8;
        }

        System.out.println(ans);

    }
}
