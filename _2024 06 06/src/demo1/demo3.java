package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 19:56
 */
class MyBlockingQueue{
    private String[] elems = null;
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    public MyBlockingQueue(int capacity){
        this.elems = new String[capacity];
    }
    public void put(String elem){
        if(size >= elems.length){
            //队列元素满的情况，要进行堵塞
            return;
        }
        elems[tail] = elem;
        size++;
        tail++;
        if(tail >= elems.length){
            tail = 0;
        }

    }
    public String take(){
        if(size == 0){
            //当队列为空时堵塞
            return null;
        }
        String result = elems[head];
        size--;//要马上跟上
        head++;
        if(head >= elems.length){
            head = 0;
        }
        return result;
    }
}
public class demo3 {
}
