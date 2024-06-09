/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-09
 * Time: 11:12
 */
public class MyBtree {

    //写入各类参数
    public static final int M = 3;//表示是三叉树

    static class BTRNode {
        public int[] keys;//存储关键字
        public int usedSize;//表示已经存储关键字的数量，孩子数就是关键字的数量加 1
        public BTRNode parent;//当前节点的父亲节点
        public BTRNode[] subs;//当前节点的孩子节点

        public BTRNode() {
            //多给一个的目的是方便分裂
            keys = new int[M - 1 + 1];
            subs = new BTRNode[M + 1];
        }
        public BTRNode root;//表示根节点
    }
}