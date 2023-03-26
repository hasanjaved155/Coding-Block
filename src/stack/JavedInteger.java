package stack;

import java.util.LinkedList;
import java.util.List;

public class JavedInteger {

    List<Integer> l = new LinkedList<>();
    public void push(int i) {
        l.add(i);
    }

    public boolean empty() {
        return l.size() == 0;
    }

    public int peek() {
        int last = l.size()-1;
        return l.get(last);
    }


    public void pop() {
        int last = l.size()-1;
        l.remove(last);
    }
}
