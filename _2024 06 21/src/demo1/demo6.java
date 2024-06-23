package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-21
 * Time: 22:24
 */
public class demo6 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list = Collections.synchronizedList(list);
    }
}
