package assignment_14_Heap;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Largest_Element_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
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