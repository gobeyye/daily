package demo1;

import java.time.LocalTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-28
 * Time: 11:02
 */


//
//package question2;


import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int[] prime = new int[30];
    static int cnt = 0;
    static boolean[] vis = new boolean[30];	//0表示是素数，1表示是合数

    static void get_prime(int n) {
        for (int i = 2; i <= n; i++) {		//这里直接跳过1
            if (!vis[i])
                prime[cnt++] = i;    //记录素数
            for (int j = 0; j < cnt && i * prime[j] <= n; j++) {		//只筛小于n的数 												//i * prime[j]在某种情况下可能越界，可用 i <= n / prime[j]
                vis[i * prime[j]] = true;
                if (i % prime[j] == 0)    //避免重复筛选
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        get_prime(n);		//寻找小于n的素数

        for (int i = 0; i < cnt; i++) {
            System.out.print(prime[i] + " ");
        }
    }

}
