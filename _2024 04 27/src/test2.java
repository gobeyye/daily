import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-27
 * Time: 23:51
 */
public class test2 {
    int[] ret;//存储最终答案
    int[] tmpNum;//nums数组的辅助临时数组
    int[] Index;//对应的数组下标
    int[] tmpIndex;//修改index的辅助数组
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        ret = new int[n];
        tmpNum = new int[n];
        Index = new int[n];
        tmpIndex = new int[n];
        for(int i = 0; i < nums.length;i++){
            Index[i] = i;
        }
        mergeSort(nums,0,nums.length - 1);
        List<Integer> path = new ArrayList<>();
        for(int i = 0;i < n;i++){
            path.add(ret[i]);
        }
        return path;
    }
    public void mergeSort(int[] nums,int left,int right){
        if(left >= right){
            return;
        }
        int mid = left + ((right - left) >> 1 );
        mergeSort(nums,left,mid);
        mergeSort(nums,mid + 1,right);
        int s1 = left,e1 = mid;
        int s2 = mid + 1, e2 = right;
        int k = 0;
        while(s1 <= e1 && s2 <= e2){
            if(nums[s1] > nums[s2]){
                tmpNum[k] = nums[s1];
                tmpIndex[k++] = Index[s1];
                ret[Index[s1++]] += right - s2 + 1;
            }else{
                tmpNum[k] = nums[s2];
                tmpIndex[k++] = Index[s2++];
            }
        }
        while(s1 <= e1){
            tmpNum[k] = nums[s1];
            tmpIndex[k++] = Index[s1++];
        }
        while(s2 <= e2){
            tmpNum[k] = nums[s2];
            tmpIndex[k++] = Index[s2++];
        }
        for(int i = 0;i < k;i++){
            nums[i + left] = tmpNum[i];
            Index[i + left] = tmpIndex[i];
        }
    }
}
