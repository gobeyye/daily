package Brush_questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-23
 * Time: 9:58
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class question1 {
    public TreeNode Convert(TreeNode pRootOfTree) {

        if(pRootOfTree == null){
            return null;
        }
        List<TreeNode> ret = new ArrayList<>();
        inOrder(pRootOfTree,ret);
        int n = ret.size();
        for(int i = 1;i < n - 1;i++){
            ret.get(i).left = ret.get(i - 1);
            ret.get(i).right = ret.get(i + 1);
        }
        if(ret.size() > 1){
            ret.get(0).left = null;
            ret.get(0).right = ret.get(1);
            ret.get(n - 1).right = null;
            ret.get(n - 1).left = ret.get(n - 2);

        }
        return ret.get(0);
    }
    public void inOrder(TreeNode root,List<TreeNode> ret){
        if(root == null){
            return;
        }
        inOrder(root.left,ret);
        ret.add(root);
        inOrder(root.right,ret);
    }
}
