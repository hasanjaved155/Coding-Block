package lec47_Heap_Or_Priority_Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_Array_2 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        //PriorityQueue<Integer>pq = new PriorityQueue<>();// minheap
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());// max heap
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int ans = 0;
        for (int i = 0; i < k ; i++) {
            ans = pq.remove();
        }
        return ans;
    }//complexity of this code is nlog(n)
}
