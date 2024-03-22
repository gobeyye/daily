/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 20:58
 *//*

public class leetcode4 {
    public int preIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeChild(preorder,inorder,0,preorder.length - 1);
    }
    public TreeNode buildTreeChild(int[] preorder,int[] inorder,int inBegin,int inEnd){
        if(inBegin > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex]);
        int rootIndex = findRootIndex(inorder,inBegin,inEnd,preorder[preIndex]);
        preIndex++;
        root.left = buildTreeChild(preorder,inorder,inBegin,rootIndex - 1);
        root.right = buildTreeChild(preorder,inorder,rootIndex + 1,inEnd);
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
