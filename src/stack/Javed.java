package stack;

import java.util.LinkedList;
import java.util.List;

public class Javed<J> {

    List<J> list = new LinkedList<>();
    public void push(J item) {
        list.add(item);
    }


    public boolean empty() {
        return list.size()==0;
    }

    public J peek() {
        int last = list.size()-1;
        return list.get(last);
    }


    public void pop() {
        int last = list.size()-1;
        list.remove(last);
    }
}
