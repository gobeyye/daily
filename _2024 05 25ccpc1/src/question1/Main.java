package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-25
 * Time: 13:55
 */


//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), k = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        int l1 = 0, r1 = 0, l2 = 0, r2 = 0;
//        long p = 0;
//        long Q = 0;
//        double sum = 0;
//        PriorityQueue<Integer> heap1 = new PriorityQueue<>((o1, o2) -> {//创建大根堆
//            return o1 < o2 ? 1 : -1;
//        });
//        PriorityQueue<Integer> heap2 = new PriorityQueue<>((o1, o2) -> {//创建小根堆
//            return o1 > o2 ? 1 : -1;
//        });
//        while (r1 < n) {
//            heap1.add(arr[r1]);
//            while (r1 - l1 >= k) {
//                heap1.remove(arr[l1]);
//                l1++;//出窗口
//            }
//            if (r1 - l1 == k - 1) {
//                //符合要求
//                p = heap1.peek();
//                //实现里面的循环
//                l2 = 0;r2 = 0;//每次都要从新来
//                while (r2 < n) {
//                    heap2.add(arr[r2]);
//                    while (r2 - l2 >= k) {
//                        heap2.remove(arr[l2]);
//                        l2++;//出窗口
//                    }
//                    if (r2 - l2 == k - 1) {
//                        //符合要求
//                        Q = heap2.peek();
//                        //实现里面的循环
//                        sum += p - Q;
//
//                    }
//                    r2++;//进窗口
//                }
//
//            }
//            r1++;//进窗口
//        }
//        double div = Math.pow(n - k + 1,2);
//        System.out.printf("%.2f",sum / div);
//    }
//}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int l1 = 0, r1 = 0, l2 = 0, r2 = 0;
        int len = 0;
        PriorityQueue<Integer> heap1 = new PriorityQueue<>((o1, o2) -> {//创建大根堆
            return o1 < o2 ? 1 : -1;
        });
        PriorityQueue<Integer> heap2 = new PriorityQueue<>((o1, o2) -> {//创建小根堆
            return o1 > o2 ? 1 : -1;
        });
        double MinSum = 0;
        double MaxSum = 0;
        while (r1 < n) {
            heap1.add(arr[r1]);
            heap2.add(arr[r1]);
            while (r1 - l1 >= k) {
                heap1.remove(arr[l1]);
                heap2.remove(arr[l1]);
                l1++;//出窗口
            }
            if (r1 - l1 == k - 1) {
                MaxSum = heap1.peek();
                MinSum = heap2.peek();
            }
            r1++;//进窗口
        }

        double sum = 0;
        double ans = (MaxSum - MinSum) / (n - k + 1);

        System.out.printf("%.2f",ans);

    }
}
