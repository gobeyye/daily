package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-18
 * Time: 16:42
 */
public class demo1 {
    public static int brokenCalc(int startValue, int target) {
        if (target <= startValue) {
            return startValue - target;
        }
        int count = 0;
        while (true) {
            if (startValue * 2 < target) {
                startValue *= 2;
                count++;
            } else if (startValue * 2 == target) {
                count++;
                return count;
            } else {
                int tmp1 = 0;
                //先算乘的
                startValue *= 2;
                tmp1++;
                tmp1 += (startValue - target);
                //再算减的
                startValue /= 2;
                int tmp2 = 0;
                startValue--;
                tmp2++;
                if(startValue * 2 >= target){
                    startValue *= 2;
                    tmp2++;
//                    tmp2 += target - startValue;
                    tmp2 += startValue - target;
                    tmp1 = Math.min(tmp1,tmp2);

                }
                count += tmp1;
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //自动处理前导零
        brokenCalc(1,1000000000);
        System.out.println();
    }
}
