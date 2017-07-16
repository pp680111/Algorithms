package sort;

/**
 * Created by qq578 on 2017/7/12.
 */
public class SelectSort {
    public static void selectSort(Object[] data){
        int i,j,least;
        Object tmp;
        for(i = 0;i < data.length - 1;i++){
            for(j = i + 1,least = i;j < data.length;j++)
                if(((Comparable)data[j]).compareTo((Comparable)data[least]) == -1)
                    least = j;

            if(least != i){
                tmp = data[least];
                data[least] = data[i];
                data[i] = tmp;
            }
        }
    }
}
