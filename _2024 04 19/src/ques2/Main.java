package ques2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-19
 * Time: 22:18
 */

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
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode root = new ListNode(-1);//带头节点
        ListNode cur = null;
        ListNode cur1 = head1, cur2 = head2;
        int jinwei = 0;
        while (cur1 != null && cur2 != null) {
            int tmp = cur1.val + cur2.val;
            cur1 = cur1.next;
            cur2 = cur2.next;
            if (jinwei != 0) {
                tmp++;
                jinwei = 0;
            }
            if (tmp >= 10) {
                jinwei++;
                tmp -= 10;
            }
            ListNode node = new ListNode(tmp);
            if (root.next == null) {
                root.next = node;
                cur = node;
            } else {
                cur.next = node;
                cur = node;
            }
        }
        if (cur1 == null && cur2 == null && jinwei != 0) {
            ListNode node = new ListNode(1);
            cur.next = node;
            cur = node;
            ListNode ans = reverse(root.next);
            return ans;
        }
        //////////////////////////////
        if (cur1 != null) {
            while (cur1 != null) {
                int tmp = cur1.val;
                cur1 = cur1.next;
                if (jinwei != 0) {
                    tmp++;
                    jinwei = 0;
                }
                if (tmp >= 10) {
                    jinwei++;
                    tmp -= 10;
                }
                ListNode node = new ListNode(tmp);
                cur1 = cur1.next;
                if (root.next == null) {
                    root.next = node;
                    cur = node;
                } else {
                    cur.next = node;
                    cur = node;
                }
            }
            if (jinwei != 0) {
                ListNode node = new ListNode(1);
                cur.next = node;
                cur = node;
                ListNode ans = reverse(root.next);
                return ans;
            }

        }
        if (cur2 != null) {
            while (cur2 != null) {
                int tmp = cur2.val;
                cur2 = cur2.next;
                if (jinwei != 0) {
                    tmp++;
                    jinwei = 0;
                }
                if (tmp >= 10) {
                    jinwei++;
                    tmp -= 10;
                }
                ListNode node = new ListNode(tmp);
                cur2 = cur2.next;
                if (root.next == null) {
                    root.next = node;
                    cur = node;
                } else {
                    cur.next = node;
                    cur = node;
                }
            }
            if (jinwei != 0) {
                ListNode node = new ListNode(1);
                cur.next = node;
                cur = node;
                ListNode ans = reverse(root.next);
                return ans;
            }
        }
        return reverse(root.next);

        // ListNode ans = reverse(root.next);
        // return null;
        // write code here
    }

    public static ListNode reverse(ListNode root) {
        if (root == null) {
            return null;
        }
        ListNode cur = root;
        ListNode prev = null;
        ListNode nextNode = root.next;
        while (nextNode != null) {
            cur.next = prev;
            prev = cur;
            cur = nextNode;
            nextNode = nextNode.next;
        }
        cur.next = prev;
        return cur;
    }

}
