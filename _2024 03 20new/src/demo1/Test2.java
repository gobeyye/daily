package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-20
 * Time: 23:19
 */
class MyCircularQueue {
    int[] elem;
    int rear;
    int front;
    public MyCircularQueue(int k) {
        elem = new int[k + 1];
    }
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        elem[rear] = value;
        rear = (rear + 1) % elem.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return elem[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        //前面的才是我们要的，现在是要填的。
        int index = (rear + elem.length - 1) % elem.length;
        return elem[index];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return (rear + 1) % elem.length == front;
    }
}
public class Test2 {
    public static void main(String[] args) {
        System.out.println();
    }
}
