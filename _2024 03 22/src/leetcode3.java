/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 20:57
 *//*


public class leetcode3 {
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return buildTreeChild(inorder,postorder,0,inorder.length - 1);
    }
    public TreeNode buildTreeChild(int[] inorder, int[] postorder,int inBegin,int inEnd){
        if(inBegin > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postIndex]);
        int index = findRootIndex(inorder,inBegin,inEnd,postorder[postIndex]);
        postIndex--;
        root.right = buildTreeChild(inorder,postorder,index + 1,inEnd);
        root.left = buildTreeChild(inorder,postorder,inBegin,index  -1);
        return root;
    }
    public int findRootIndex(int[] inorder,int inBegin,int inEnd,int key){
        for(int i = inBegin;i <= inEnd;i++){
            if(inorder[i] == key){
                return i;
            }
        }
        return -1;
    }
}
*/
