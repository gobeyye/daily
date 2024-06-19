package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 13:07
 */

public class Tree {
    //创建哈夫曼树
    //调试完毕
    //参数说明：ht 表示传入的叶子节点，n 表示叶子节点数
    //作用：构建哈夫曼树，存储在 ht 中。
    public static void createHT(HTNode ht[], int n) {
        //初始化
        int k = 0;//用来后续查找最小的两个叶子节点的权值下标
        int total = 2 * n - 1;//表示全部节点数
        double minl, minr;//存储区间内最小权值的两个节点
        int lnode, rnode;//存储最小权值的两个节点在数组中的下标
        for (int i = 0; i < total; i++) ht[i].parent = ht[i].lchild = ht[i].rchild = -1;//都初始化为 -1 ，表示叶子节点
        //开始创建
        for (int i = n; i < total; i++) {
            //要找最小，所以刚开始要初始化为 最大
            minl = 0x3f3f3f3f;
            minr = 0x3f3f3f3f;//minl 是最小的，minr 是次小的权值
            lnode = rnode = -1;//存储最小权值对应的下标
            for (k = 0; k <= i - 1; k++) {
                if (ht[k].parent == -1) {
                    if (ht[k].weight < minl) //如果比 minl 还小的话，两个存储值都要改变
                    {
                        minr = minl;
                        rnode = lnode;
                        minl = ht[k].weight;
                        lnode = k;
                    } else if (ht[k].weight < minr) { //走到这里说明 minl 小于 ht[k].weight，所以只需要修改 minr 即可
                        minr = ht[k].weight;
                        rnode = k;
                    }
                }
            }
            // i 表示 合并新节点的下标
            // lchild 表示被合并的左节点
            // rchild 表示被合并的右节点
            ht[i].weight = ht[lnode].weight + ht[rnode].weight;
            ht[i].lchild = lnode;
            ht[i].rchild = rnode;
            ht[lnode].parent = i;
            ht[rnode].parent = i;
        }
    }

    /**
     * 方法作用为：创建哈夫曼编码规则
     * @param ht
     * @param n
     * @return
     */
    public static HCode[] createHCode(HTNode ht[], int n) {
        HCode[] hcds = new HCode[n];
        int parent; int cur;
        for (int i = 0; i < n; i++)
        {
            HCode tmp = new HCode();
            cur = i;
            //预备工作，初始化cur 和 parent
            parent = ht[cur].parent;
            tmp.data = ht[cur].data;
            while (parent != -1)
            {
                if (cur == ht[parent].lchild)
                {
                    //是左孩子
                    tmp.cd.append('0') ;
                }
                else
                {
                    //右孩子
                    tmp.cd.append('1') ;
                }
                //向上查找
                cur = parent;
                parent = ht[cur].parent;
            }
            //进行翻转
            tmp.cd = tmp.cd.reverse();
            hcds[i] = tmp;
        }
        return hcds;
    }

}
