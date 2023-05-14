package lec45_oops;

public class Stack_Class implements StackI{

    @Override
    public void push() {

    }

    @Override
    public int pop() {
        int x = StackI.val;
        //StackI.val += 3;// we can't change final variable
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
