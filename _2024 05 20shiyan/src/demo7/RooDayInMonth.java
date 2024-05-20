package demo7;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 17:29
 */

public class RooDayInMonth {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        String s = String.format("% tF(% < ta)",calendar);
        System.out.println(s);
        int n = 25;
        System.out.println("向后滚动(在月内)" + n + "天");
        calendar.roll(calendar.DAY_OF_MONTH,n);
        s = String.format("% tF(% < ta)",calendar);
        System.out.println(s);
        System.out.println("再向后滚动(在年内)" + n + "天");
        calendar.roll(calendar.DAY_OF_MONTH,n);
        s = String.format("% tF(% < ta)",calendar);
        System.out.println(s);
    }
}
