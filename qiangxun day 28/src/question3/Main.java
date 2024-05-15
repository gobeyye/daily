//package question3;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HXL
// * Date: 2024-05-15
// * Time: 21:55
// */
//import java.util.*;
//
///*
// * public class TreeNode {
// *   int val = 0;
// *   TreeNode left = null;
// *   TreeNode right = null;
// *   public TreeNode(int val) {
// *     this.val = val;
// *   }
// * }
// */
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param root TreeNode类
//     * @return int整型
//     */
//    static int countLeft;
//    static int countRight;
//    public int maxPathSum (TreeNode root) {
//        // write code here
//        //1.找出左右子树的最大高度
//        int leftMax = maxHeight(root.left);//关于空节点来一个特判即可
//        int rightMax = maxHeight(root.right);
//        countLeft = dfs(root.left,1,leftMax);//找出左子树高度等于leftMax
//        countRight = dfs(root.right,1,rightMax);//找出右子树高度等于rightMax的
//        ////注意处理左右子树为空的情况
//        //2.找出左右子树的最大高度分支分别有多少个
//        // System.out.println(countLeft);
//        // System.out.println(countRight);
//        // System.out.println(leftMax);
//        // System.out.println(rightMax);
//        return countLeft * countRight * (leftMax + rightMax + 1) * 2;
//
//        //3.返回结果
//    }
//    public static int dfs(TreeNode root,int step,int max){
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null && root.right == null){
//            if(step == max){
//                return 1;
//            }else{
//                return 0;
//            }
//        }
//        int left = dfs(root.left,step + 1,max);
//        int right = dfs(root.right,step + 1,max);
//        return left + right;
//    }
//    public int maxHeight(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int left = maxHeight(root.left);
//        int right = maxHeight(root.right);
//        return Math.max(left,right) + 1;
//    }
//}
