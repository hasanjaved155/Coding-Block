package lec47_Heap_Or_Priority_Queue;

import java.util.ArrayList;

public class Heap_Demo<T extends Comparable<T>> {
    // It is complete binary tree with specific priority
    // two types of heap--> minHeap and maxHeap

    //-------------------------- minHeap--------------------------------//
    private ArrayList<T>list = new ArrayList<>();
    public void add(T item){
        list.add(item);
        upHeapify(list.size() - 1);
    }

    private void upHeapify(int ci) {
        int pi = (ci - 1) / 2;
        if (isLarger(list.get(ci),list.get(pi)) > 0){
            swap(pi,ci);
            upHeapify(pi);
        }
    }
    private void swap(int pi, int ci){
        T pith = list.get(pi);
        T cith = list.get(ci);
        list.set(pi,cith);
        list.set(ci,pith);
    }
    public T remove(){
      swap(0,list.size() - 1);
      T rv = list.remove(list.size() - 1);
      downHeapify(0);

      return rv;
    }

    private void downHeapify(int pi) {
        int l = (2 * pi) + 1;
        int r = (2 * pi) + 2;
        int min = pi;
        if (l < list.size() && isLarger(list.get(l),list.get(min)) > 0){
            min = l;
        }
        if (r < list.size() && isLarger(list.get(r),list.get(min)) > 0){
            min = r;
        }
        if (min != pi){
            swap(pi,min);
            downHeapify(min);
        }
    }

    public T getMin(){
        return list.get(0);
    }
    public void display(){
        System.out.println(list);
    }

    public int isLarger(T o1, T o2){
        return o1.compareTo(o2);
    }

}
