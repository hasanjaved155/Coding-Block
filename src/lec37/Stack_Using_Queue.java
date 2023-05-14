package lec37;

import lec35_Inheritance.*;

public class Stack_Using_Queue {
   private Dynamic_Queue q;
   public Stack_Using_Queue(){
      q = new Dynamic_Queue();
   }
   public boolean isEmpty(){
      //return q.size == 0;
      return q.isEmpty();
   }
   public int size(){
      return q.size;
   }
   public void push(int item) throws Exception {
      Dynamic_Queue hlp = new Dynamic_Queue();
      while (!q.isEmpty()) {
         hlp.enque(q.deque());
      }
      q.enque(item);
         while (!hlp.isEmpty()) {
            q.enque(hlp.deque());
         }
   }
   public int pop() throws Exception{
      return q.deque();
   }
   public int peek() throws Exception{
      return q.getFront();
   }
}
