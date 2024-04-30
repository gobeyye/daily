/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 *//*

class ListNode{
    int val;
    ListNode next;
}
public class Main {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeSort(lists,0,lists.length - 1);
    }
    public ListNode mergeSort(ListNode[] lists,int left,int right){
        if(left > right){
            return null;
        }
        if(left == right){
            return lists[left];
        }
        int mid = left + ((right - left) >> 1);
        ListNode cur1 = mergeSort(lists,left,mid);
        ListNode cur2 = mergeSort(lists,mid + 1,right);
        ListNode newHead = new ListNode(0);
        ListNode rear = newHead;
        ListNode node = null;
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                node = new ListNode(cur1.val);
                cur1 = cur1.next;
            }else{
                node = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            rear.next = node;
            rear = node;
        }
        while(cur1 != null){
            node = new ListNode(cur1.val);
            rear.next = node;
            rear = node;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            node = new ListNode(cur2.val);
            rear.next = node;
            rear = node;
            cur2 = cur2.next;
        }
        return newHead.next;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}*/
