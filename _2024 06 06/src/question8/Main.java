package question8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 16:24
 */



import java.util.*;
class Stone{
    int nums;
    int color;
    public void setNums(int nums){
        this.nums = nums;
    }
    public void setColor(int color){
        this.color = color;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stone[] stones = new Stone[n];//都是一个个对象
        for(int i = 0;i < n;i++){
            stones[i] = new Stone();
            stones[i].setNums(in.nextInt());
        }
        for(int i = 0;i < n;i++){
            stones[i].setColor(in.nextInt());
        }
        int sum = 0;
        for(int i = 0;i < n - 1;i++){
            if(stones[i].color == stones[i + 1].color){
                sum += stones[i].nums + stones[i].nums;
            }
        }

    }
}
