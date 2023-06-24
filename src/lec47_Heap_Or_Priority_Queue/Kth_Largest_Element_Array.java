package lec47_Heap_Or_Priority_Queue;
import java.util.PriorityQueue;

public class Kth_Largest_Element_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,7,30,4,12,13,7,6,8,9};
        int k = 3;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        PriorityQueue<Integer>pq = new PriorityQueue<>();// minheap
        //PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());// max heap
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length ; i++) {
            if (nums[i] > pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
