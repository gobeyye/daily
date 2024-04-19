package test3;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-19
 * Time: 20:59
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = in.nextInt();
        int k = in.nextInt();
        long sum = 0;
        for(int i = 0;i < n;i++){
            int tmp = in.nextInt();
            if(tmp % 2 == 0){
                queue.offer(tmp);
            }else{
                sum += tmp;
            }
        }
        while(k > 0){
            if(queue.isEmpty()){
                break;
            }
            int tmp = queue.poll();
            if(tmp % 2 == 1){
                sum += tmp;
            }else{
                tmp /= 2;
                queue.offer(tmp);
                k--;
            }

        }
        while(!queue.isEmpty()){
            sum += queue.poll();
        }
        System.out.println(sum);
    }
}
