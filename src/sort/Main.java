package sort;

/**
 * Created by qq578 on 2017/7/12.
 */
public class Main {
    public static void main(String[] args){
        Item[] items = {new Item(4),new Item(6),new Item(1),new Item(3),new Item(2),new Item(9),new Item(12)};
        MergeSort.mergeSort(items);
        for(Item i : items){
            System.out.println(i.getElement() + " ");
        }

//        int[] arr = {2,8,6,1,10,15,3,12,11};
//        HeapSort heap = new HeapSort();
//        heap.heapSort(arr);
    }


}
