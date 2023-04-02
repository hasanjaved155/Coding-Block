package lec35_Data_Structures;

public class Stack{
    private int[] arr;
    private int toss;
    public Stack(){
        arr = new int[5];
        toss = -1;
    }
    public Stack(int capacity){
        arr = new int[capacity];
        toss = -1;
    }
    public boolean isEmpty(){
        // return toss == -1;
        if (toss == -1)return true;
        return false;
    }
    public boolean isFull(){
        // return toss == arr.length - 1;;
        if (toss == arr.length - 1)return true;
        return false;
    }
    public void push(int item) throws Exception{
        if (isFull()){
            throw new Exception("Invalid Input Stack is full");
        }
        toss++;
        arr[toss] = item;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Invalid Input Stack is full");
        }
        int val = arr[toss];
        toss--;
        return val;
    }
    public int size(){
        return toss + 1;
    }
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Invalid Input Stack is full");
        }
        return arr[toss];
    }
    public void Display(){
        for (int i = 0; i <= toss ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
