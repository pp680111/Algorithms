package sort;

/**
 * Created by qq578 on 2017/7/12.
 */
public class InsertSort {
    public static void insertSort(Object[] data){
        Comparable tmp;

        for(int i = 1,j; i< data.length;i++)
        {
            tmp = (Comparable)data[i];
            for(j = i;j > 0 && tmp.compareTo(data[j - 1]) == -1;j--)
                data[j] = data[j - 1];

            data[j] = tmp;
        }
    }
}
