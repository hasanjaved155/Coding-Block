package lec39;

public class Linked_List_Cycle_2 {
     public class ListNode{
         int val;
         ListNode next;
         ListNode(){

         }
         ListNode(int val){
             this.val = val;
         }
         ListNode(int val, ListNode next){
             this.val = val;
             this.next = next;
         }
     }
     public class Solution {
         public boolean hasCycle(ListNode head) {
             ListNode fast = head;
             ListNode slow = head;
             while (fast != null && fast.next != null) {
                 fast = fast.next.next;
                 slow = slow.next;
                 if (slow == fast) {
                     return true;
                 }
             }
             return false;
        }
    }
}
