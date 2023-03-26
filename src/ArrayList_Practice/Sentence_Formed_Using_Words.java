package ArrayList_Practice;

import java.util.*;

public class Sentence_Formed_Using_Words {
    static class Pair{
        int key;
        String value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           Pair p = new Pair();
           p.key = scanner.nextInt();
           p.value = scanner.next();
           list.add(p);
        }
        list.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.key-o2.key;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).value);
        }
    }
}
