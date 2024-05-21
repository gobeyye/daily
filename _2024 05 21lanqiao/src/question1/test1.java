package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 10:03
 */
public class test1 {
    public static void main(String[] args) {
        //2023 中能被 7 整除的个数有多少个
        int ret = 0;
        for(int i = 1;i <= 2023 * 2;i++){
            if(i % 119 == 0){
                ret++;
            }
        }
        System.out.println(ret);
        System.out.println((2023 * 2) / 119);
    }
}
