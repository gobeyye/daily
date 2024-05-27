package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 8:31
 */

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */


class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param lists ListNode类ArrayList
     * @return ListNode类
     */
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // write code here
        int n = lists.size();
        ListNode newHead = new ListNode(-1);
        //1.封装函数，两个两个合并
        for (int i = 0; i < n; i++) {
            newHead.next = merge(newHead.next, lists.get(i));
        }
        //2.返回结果
        return newHead.next;

    }

    public ListNode merge(ListNode root1, ListNode root2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (root1 != null && root2 != null) {
            if (root1.val > root2.val) {
                cur.next = root2;
                root2 = root2.next;
            } else {
                cur.next = root1;
                root1 = root1.next;
            }
            cur = cur.next;
        }
        while (root1 != null) {
            cur.next = root1;
            root1 = root1.next;
            cur = cur.next;
        }
        while (root2 != null) {
            cur.next = root2;
            root2 = root2.next;
            cur = cur.next;
        }
        return head.next;
    }

}
