import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 17:15
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class leetcode1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q){
            return root;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        getPath(root,p,stack1);
        getPath(root,q,stack2);
        int size1 = stack1.size();
        int size2 = stack2.size();
        if(size1 > size2){
            int size = size1 - size2;
            while(size > 0){
                stack1.pop();
                size--;
            }
        }else{
            int size = size2 - size1;
            while(size > 0){
                stack2.pop();
                size--;
            }
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek() == stack2.peek()){
                return stack1.pop();
            }else{
                stack1.pop();
                stack2.pop();
            }
        }
        return null;
    }
    public boolean getPath(TreeNode root,TreeNode node,Stack<TreeNode> stack){
        if(root == null){
            return false;
        }
        stack.push(root);
        if(root == node){
            return true;
        }
        boolean leftPath = getPath(root.left,node,stack);
        if(leftPath == true){
            return true;
        }
        boolean rightPath = getPath(root.right,node,stack);
        if(rightPath == true){
            return true;
        }
        stack.pop();
        return false;

    }
}
