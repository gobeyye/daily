package demo1;

import java.util.Timer;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 10:55
 */
public class demo4 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Date date = new Date(100);
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                System.out.println("hello");
            }
        };

        timer.schedule(task,100);
    }
}
