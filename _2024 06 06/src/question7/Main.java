package question7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 12:42
 */



//超时
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//public class Main {
//    static Read in = new Read();
//    public static void main(String[] args) throws IOException{
////        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        List<Integer> arr = new ArrayList<>();
//        for(int i = 0;i < n;i++){
//            arr.add(in.nextInt());
//        }
//        Collections.sort(arr,(o1,o2) -> {// 链表底层不能快排
//            return o1 >= o2 ? -1 : 1;
//        });
//        long sum = 0;//存储最后的答案
//        boolean[] vis = new boolean[n];
//        int count = 0;
//        while(arr.size() > 0){
//            sum += arr.get(0);
//            count++;
//            if(count == 2){
//                count = 0;
//                binary(arr,arr.get(0) / 2);//删除到 arr 中小于的一个数
//            }
//            arr.remove(0);
//        }
//        System.out.println(sum);
//    }
//    public static void binary(List<Integer> arr,int x){
//        int n = arr.size();
//        int left = 0,right = n - 1;
//        while(right > left){//右模板
//            int mid = left + (right - left) / 2;
//            if(arr.get(mid) > x){
//                left = mid + 1;
//            }else{
//                right = mid;
//            }
//        }
//        if(arr.get(left) > x){
//            return;
//        }
//        arr.remove(left);
//    }
//}
//class Read{
//    StringTokenizer st = new StringTokenizer("");
//    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    String next() throws IOException{
//        while(!st.hasMoreTokens()) {
//            st = new StringTokenizer(bf.readLine());
//        }
//        return st.nextToken();
//    }
//    int nextInt() throws IOException{
//        return Integer.parseInt(next());
//    }
//}
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //读入数据
        Integer[] arr = new Integer[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr,(o1,o2) -> {//从大到小排序
            return o1 >= o2 ? -1 : 1;//或者（o2 - o1）
        });
        long sum = 0;//存储总花费
        Queue<Integer> q = new LinkedList<>();//存储可以免费的金额，保证是先进先出
        int count = 0;//记录何时到达二次
        for(int i = 0;i < n;i++){
            if(!q.isEmpty() && q.peek() >= arr[i]) {//说明可以免费带走
                q.poll();//队头免费金额用过了，把队头弹出去。
                continue;//跳过这个商品
            }
            sum += arr[i];
            count++;
            if(count == 2){
                count = 0;
                q.add(arr[i] / 2);//可以免费的金额，存入队列
            }
        }
        System.out.println(sum);
    }
}


