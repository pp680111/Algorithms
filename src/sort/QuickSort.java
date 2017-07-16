package sort;

/**
 * Created by qq578 on 2017/7/16.
 */
public class QuickSort {
    public static void quickSort(Object[] data){
        if(data.length <= 1)
            return;

        quickSort(data,0,data.length - 1);
    }
    private static void quickSort(Object[] data,int l,int r){
        Object tmp = data[l];
        int i = l,j = r;

        while(i < j){
            while(((Comparable)data[j]).compareTo(tmp) == 1 && i < j)
                j--;
            if(i < j)
                data[i++] = data[j];

            while(i < j && ((Comparable)data[i]).compareTo(tmp) == -1)
                i++;
            if(i < j)
                data[j--] = data[i];
        }
        data[i] = tmp;

        if(l < r){
            quickSort(data,l,i - 1);
            quickSort(data,i + 1,r);
        }

    }
}
