package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-30
 * Time: 20:43
 */
class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Main {

    public static ListNode create(int[] nums){
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        for(int i = 0;i < nums.length;i++){
            ListNode node = new ListNode(nums[i]);
            cur.next = node;
            cur = node;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,4,5};
        int[] nums2 = {1,3,4};
        int[] nums3 = {2,6};
        ListNode cur1 = create(nums1);
        ListNode cur2 = create(nums2);
        ListNode cur3 = create(nums3);
        ListNode[] all = new ListNode[3];
        all[0] = cur1;
        all[1] = cur2;
        all[2] = cur3;
        mergeKLists(all);

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        //1.创建虚拟头节点
        int n = lists.length;
        if(lists.length == 0){
            return null;
        }
        ListNode newHead = new ListNode(0);
        ListNode rear = newHead;
        ListNode[] cur = new ListNode[n];
        for(int i = 0;i < n;i++){
            cur[i] = lists[i];
        }
        int minIndex = -1;
        int minNum = Integer.MAX_VALUE;
        while(true){
            minIndex = -1;
            minNum = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++){

                if(cur[i] != null){
                    if(cur[i].val < minNum){
                        minNum = cur[i].val;
                        minIndex = i;
                    }
                }
            }
            if(minIndex == -1){
                break;
            }
            ListNode node = new ListNode(cur[minIndex].val);
            cur[minIndex] = cur[minIndex].next;
            rear.next = node;
            rear = node;
        }
        return newHead.next;
    }
    public static void reorderList(ListNode head) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode cur = head;
        ListNode next = head.next;
        ListNode tail = null;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        cur = head;
        while(count != 1 && count != 2){
            int j = count - 1;
            tail = cur;
            while(j > 0){
                tail = tail.next;
                j--;
            }
            cur.next = tail;
            tail.next = next;
            cur = next;
            count -= 2;
            next = cur.next;
        }
        if(count == 2){
            next.next = null;
        }
        if(count == 1){
            next = null;
        }
        head = newHead.next;
    }
//    public static void main1(String[] args) {
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//        map.put(3,3);
//        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
//        for(int a){
//            System.out.println(a);
//        }
//    }
}
