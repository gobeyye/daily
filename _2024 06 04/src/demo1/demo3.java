package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 23:13
 */
class Singleton{
    private static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    private Singleton(){}
}
public class demo3 {
    public static void main(String[] args) {

    }
}
