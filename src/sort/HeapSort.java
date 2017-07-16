package sort;

/**
 * Created by qq578 on 2017/7/15.
 */
public class HeapSort {
    public static class Node{
        public int key;
        public Node left,right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    int[] heap;
    int count;
    int capacity;
    public static int ins = 10;
    public static void pri(){
        System.out.print("SS");
    }

    public HeapSort(){

    }

    public void buildHeap(int[] data){
        heap = data;
        count = data.length;
        capacity = data.length;

        int n = heap.length / 2 - 1;
        int tmpIndex;

        while(n >= 0){
            swapDown(n);
            n--;
        }
    }

    public void heapSort(int[] data){
        int tmp;

        buildHeap(data);

        while(count > 0){
            //堆首和堆的最后一个元素交换，堆元素减一
            tmp = heap[count - 1];
            heap[count - 1] = heap[0];
            heap[0] = tmp;
            count--;


            swapDown(0);
        }

        for(int i = 0;i < capacity;i++){
            System.out.print(heap[i] + " ");
        }
    }

    private void swap(int index1,int index2){
        int tmp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = tmp;
    }

    private void swapDown(int index){
        while(index <= (count / 2 - 1)){
            if(index * 2 + 2 < count) {
                if(heap[index * 2 + 1] > heap[index * 2 + 2]){
                    if(heap[index] < heap[index * 2 + 1]) {
                        swap(index,index * 2 + 1);
                        index = index * 2 + 1;
                    }
                    else break;

                }else{
                    if(heap[index] < heap[index * 2 + 2]){
                        swap(index,index * 2 + 2);
                        index = index * 2 + 2;
                    }
                    else break;
                }
            }
            else{
                //处理最后一个枝节点只有一个子节点的情况
                if(heap[index] < heap[index * 2 + 1]) {
                    swap(index,index * 2 + 1);
                    index = index * 2 + 1;
                }
                else break;
            }
        }
    }
}
