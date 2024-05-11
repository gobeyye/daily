package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-11
 * Time: 21:06
 */
interface Com{
    int M = 200;
    int f();
}
class ImpCom implements Com{
    @Override
    public int f() {
        return 100 + M;
    }
}
public class Main {
}
