package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 19:13
 */
class Singleton{
    //都是针对一个对象的
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
class SingletonLaze{
    private static volatile SingletonLaze instance = null;
    private SingletonLaze(){}
    public static SingletonLaze getInstance(){
        if(instance == null){
            synchronized(SingletonLaze.class){
                if(instance == null){
                    instance = new SingletonLaze();
                }
            }
        }
        return instance;
    }
}
public class demo1 {
}
