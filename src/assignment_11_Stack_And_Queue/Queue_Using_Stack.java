package assignment_11_Stack_And_Queue;

import java.util.Scanner;
        class Stack{
        protected int[] arr;
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
                throw new Exception("Invalid Input Stack is Empty");
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
                throw new Exception("Invalid Input Stack is Empty");
            }
            return arr[toss];
        }
        public void Display(){
            for (int i = toss; i >= 0 ; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

   class Dynamic_Stack extends Stack {
    @Override
    public void push(int item) throws Exception {
        if (isFull()){
            int[] narr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                narr[i] = arr[i];
            }
            arr = narr;
        }
        super.push(item);
    }
}
    public class Queue_Using_Stack {
    private Dynamic_Stack q;

    public Queue_Using_Stack(){
        q = new Dynamic_Stack();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
    public int size(){
        return q.size();
    }
    public void enqueue(int item) throws Exception {

        try {
            Dynamic_Stack hlp = new Dynamic_Stack();

            while (!q.isEmpty()) {
                hlp.push(q.pop());
            }

            q.push(item);

            while (!hlp.isEmpty()) {
                q.push(hlp.pop());
            }

        } catch (Exception e) {
            throw new Exception("Queue is Full.");
        }
    }

    public int dequeue() throws Exception {

        try {
            return q.pop();
        } catch (Exception e) {
            throw new Exception("Queue is Empty");
        }
    }
    public void display() {

        q.Display();
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue_Using_Stack st = new Queue_Using_Stack();
        for (int i = 0; i < n; i++) {
            st.enqueue(i);
        }
        st.display();
    }
}
