package sort;

/**
 * Created by qq578 on 2017/7/15.
 */
public class ShellSort{
    public static void shellSort(Object[] data){
        int i,j;
        int gap = 1;
        Object tmp;

        while(gap < data.length / 3)
            gap = gap * 3 + 1;
        for(;gap > 0;gap /= 3)
            for(i = gap;i < data.length;i++){
                tmp = data[i];
                for(j = i - gap;j >= 0 && ((Comparable)tmp).compareTo(data[j]) == -1;j -= gap)
                    data[j + gap] = data[j];
                data[j + gap] = tmp;
            }

    }
}
