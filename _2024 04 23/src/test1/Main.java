/*
package test1;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-23
 * Time: 10:28
 *//*

import java.util.*;
public class Main {
    public int findKthLargest(int[] nums, int k) {
        int ans = quickSort(nums,0,nums.length - 1,k);
        return ans;
    }
    public int quickSort(int[] nums,int l,int r,int k){
        if(l >= r){
            return - 1;
        }
        int left = l - 1,right = r + 1;
        int i = l;
        int key = nums[new Random().nextInt(r - l  + 1) + l];
        while(i < right){
            if(nums[i] < key){
                swap(nums,++left,i++);
            }else if(nums[i] == key){
                i++;
            }else{
                swap(nums,--right,i);
            }
        }
        if(r - right + 1 >= k){
            quickSort(nums,right,r,k);
        }else if(r - right + 1 + right - left - 1 >= k){
            return key;
        }else{
            quickSort(nums,l,left,k - (r - right + 1 + right - left - 1));
        }
    }
    public void swap(int[] nums,int x,int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
*/
