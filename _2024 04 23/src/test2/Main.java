package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-23
 * Time: 12:58
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {10,6,7,1};
        mergeSort(nums,0,nums.length - 1);
        for(int x:nums){
            System.out.print(x + " ");
        }
    }
    public static void mergeSort(int[] nums,int left,int right){
        if(left >= right){
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(nums,left,mid);
        mergeSort(nums,mid + 1,right);
        merge(nums,left,mid,right);
    }
    public static void merge(int[] nums,int left,int mid,int right){
        int s1 = left;
        int e1 = mid;
        int s2 = mid + 1;
        int e2 = right;
        int[] arry = new int[right - left + 1];
        int k = 0;
        while(s1 <= e1 && s2 <= e2){
            if(nums[s1] <= nums[s2]){
                arry[k++] = nums[s1++];
            }else{
                arry[k++] = nums[s2++];
            }
        }
        while(s1 <= e1){
            arry[k++] = nums[s1++];
        }
        while(s2 <= e2){
            arry[k++] = nums[s2++];
        }
        for(int i = 0;i < k;i++){
            nums[i + left] = arry[i];
        }
    }
}
