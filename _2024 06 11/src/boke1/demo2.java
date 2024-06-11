package boke1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 20:09
 */
class SingletonLaze {
    private static volatile SingletonLaze instance = null;
    private static Object locker = new Object();

    private SingletonLaze() {
    }

    public static SingletonLaze getInstance() {
        if (instance == null) {
            synchronized (locker) {
                if (instance == null) {
                    instance = new SingletonLaze();
                }
            }
        }
        return instance;
    }
}

public class demo2 {
    public static void main(String[] args) {

    }
}
