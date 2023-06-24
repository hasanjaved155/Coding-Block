package lec47_Heap_Or_Priority_Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_K_Sorted_Lists {
    public class ListNode {

        int val;

        ListNode next;


        ListNode() {
        }


        ListNode(int val) {
            this.val = val;
        }


        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }


    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode>pq = new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });
            for(ListNode node : lists){
                if (node != null){
                    pq.add(node);
                }
            }
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            while (!pq.isEmpty()){
                ListNode node = pq.poll();
                temp.next = node;
                temp = temp.next;
                if (node.next != null){
                    pq.add(node.next);
                }
            }
            return dummy.next;
        }
    }
}