package lec35_Data_Structures;

public class Queue {
    protected int[] arr;
    protected int front;
    public int size;

    public Queue(){
        arr = new int[5];
        front = 0;
        size = 0;
    }
    public Queue(int capacity){
        arr = new int[capacity];
        front = 0;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == arr.length;
    }

    public void enque(int item) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full");
        }
        int index = (size + front) % arr.length;
        arr[index] = item;
        size++;
    }
    public int deque() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is full");
        }
     int val = arr[front];
     front = (front + 1) % arr.length;
     size--;
     return val;
    }
    public int getFront() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is full");
        }
        int val = arr[front];
        return val;
    }
    public void Display(){
        for (int i = 0; i < size; i++) {
            int index = (i + front) % arr.length;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}
