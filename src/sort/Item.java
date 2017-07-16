package sort;

/**
 * Created by qq578 on 2017/7/12.
 */
public class Item implements Comparable<Item> {
    int element;

    public Item(int data){
        this.element = data;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    @Override
    public int compareTo(Item o) {
        if(this.element > o.getElement())
            return 1;
        else if(this.element < o.getElement())
            return -1;
        else return 0;
    }
}
