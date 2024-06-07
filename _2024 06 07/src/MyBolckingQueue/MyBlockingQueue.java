package MyBolckingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-07
 * Time: 21:14
 */
public class MyBlockingQueue {
    private String[] elems = null;
    private volatile int tail = 0;//尾指针
    private volatile int head = 0;//头指针
    private volatile int size = 0;//大小

    public MyBlockingQueue(int capacity) {
        elems = new String[capacity];
    }

    /**
     * 把元素 elem 加入到队列中
     *
     * @param elem
     */
    public void put(String elem) throws InterruptedException {
        synchronized (this) {//保证线程安全
            while (size >= elems.length) {//最好写成 while
                //队列满的情况，阻塞
                this.wait();
            }
            elems[tail] = elem;
            size++;
            tail++;
            if (tail >= elems.length) {
                tail = 0;
            }
            this.notify();
        }
    }
    //take
    public String take() throws InterruptedException {
        synchronized (this) {
            if (size == 0) {
                //当队列为空时，阻塞
                this.wait();
            }
            String result = elems[head];
            size--;
            head++;
            if (head >= elems.length) {
                head = 0;
            }
            this.notify();
            return result;
        }
    }
}
