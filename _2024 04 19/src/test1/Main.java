package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-19
 * Time: 15:36
 */
public class Main {
    public static void quickSort(int[] nums,int left,int right){
        if(left >= right){
            return;
        }
        int div = partition2(nums,left,right);
        quickSort(nums,left,div - 1);
        quickSort(nums,div + 1,right);
    }
    public static int partition1(int[] nums,int left,int right){
        int i = left;
        int j = right;
        int pivot = nums[left];
        while(j > i){
            while(j > i && nums[j] >= pivot){
                j--;
            }
            while(j > i && nums[i] <= pivot){
                i++;
            }
            swap(nums,i,j);
        }
        swap(nums,i,left);
        return i;
    }
    public static int partition2(int[] nums,int left,int right){
        int i = left;
        int j = right;
        int pivot = nums[left];
        while(j > i){
            while(j > i && nums[j] >= pivot){
                j--;
            }
            nums[i] = nums[j];
            while(j > i && nums[i] <= pivot){
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        return i;
    }
    public static void swap(int[] nums,int x,int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
    public static void main(String[] args) {

    }
}
