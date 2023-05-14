package lec39;

public class Sort_List {
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
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode mid = middleNode(head);
            ListNode midnext = mid.next;
            mid.next = null;
            ListNode A = sortList(head);
            ListNode B = sortList(midnext);
            return mergeTwoLists(A, B);
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                    temp = temp.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                    temp = temp.next;
                }
            }
            if (list1 != null) {
                temp.next = list1;
            }
            if (list2 != null) {
                temp.next = list2;
            }
            return dummy.next;
        }

        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
