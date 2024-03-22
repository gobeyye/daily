/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 21:27
 */
public class leetcode5 {
    StringBuilder ans;
    public String tree2str(TreeNode root) {
        ans = new StringBuilder();
        tree2strChild(root);
        return ans.toString();
    }
    public void tree2strChild(TreeNode root){
        if(root == null){
            return;
        }
        ans.append(root.val);

        //左子树
        if(root.left != null){
            ans.append("(");
            tree2strChild(root.left);
            ans.append(")");
        }else{
            if(root.right == null){
                return;
            }else{
                ans.append("()");
            }

        }
        //右子树
        if(root.right != null){
            ans.append("(");
            tree2strChild(root.right);
            ans.append(")");
        }else{
            return;
        }
    }
}
