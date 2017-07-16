package sort;

/**
 * Created by qq578 on 2017/7/12.
 */
public class BubbleSort {
    public static void bubbleSort(Object[] data){
        Object tmp;
        for(int i = 0;i < data.length;i++)
            for(int j = 0;j < data.length - 1 - i;j++)
                if(((Comparable)data[j]).compareTo((Comparable)data[j + 1]) > 0)
                {
                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
    }
}
