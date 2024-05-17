package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-17
 * Time: 22:07
 */
import java.util.Scanner;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class test1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        int ret = 0, i = 0;
        while(i < n)
        {
            if(i == n - 1)
            {
                ret++;
                break;
            }
            if(arr[i] < arr[i + 1])
            {
                while(i + 1 < n && arr[i] <= arr[i + 1]) i++;
                ret++;
            }
            else if(arr[i] > arr[i + 1])
            {
                while(i + 1 < n && arr[i] >= arr[i + 1]) i++;
                ret++;
            }
            else
            {
                while(i + 1 < n && arr[i] == arr[i + 1]) i++;
            }
            i++;
        }
        System.out.println(ret);
    }
}
