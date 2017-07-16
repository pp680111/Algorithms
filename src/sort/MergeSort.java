package sort;

/**
 * Created by qq578 on 2017/7/16.
 */
public class MergeSort {
    public static void mergeSort(Object[] data){
        mergeSort(data,0,data.length - 1);
    }

    private static void mergeSort(Object[] data,int start,int last){
        int i,j,k;
        Object[] tmp;
        if(start < last){
            mergeSort(data,start,(start + last) / 2);
            mergeSort(data,(start + last) / 2 + 1,last);

            tmp = new Object[last - start + 1];
            i = 0;
            j = start;
            k = (start + last) / 2 + 1;

            while(j <= (start + last) / 2 && k <= last)
                if(((Comparable)data[j]).compareTo(data[k]) == -1)
                    tmp[i++] = data[j++];
                else tmp[i++] = data[k++];

            if(j > (start + last) / 2)
                while(k <= last)
                    tmp[i++] = data[k++];
            else while(j <= (start + last) / 2)
                    tmp[i++] = data[j++];

            //直接利用last来当索引复制数组元素，此时i的大小为tmp数组长度，需要先自减一下再拿来当索引
            while(last >= start)
                data[last--] = tmp[--i];
        }
    }
}
