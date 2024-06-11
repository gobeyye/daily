package boke1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 19:53
 */
class Singleton{
    private static Singleton instance = new Singleton();//static 要记得加
    private Singleton(){}//这里要设置成 private，防止创建出多个实例
    public static Singleton getInstance(){
        return instance;
    }
}
public class demo1 {
}
