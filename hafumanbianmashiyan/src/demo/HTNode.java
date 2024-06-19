package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 13:05
 */
public class HTNode {
    char data;
    int weight;
    int parent;
    int lchild;
    int rchild;
    //对应的构造方法，初始化对应参数。
    public HTNode(char data,int weight){
        this.data = data;
        this.weight = weight;
        this.lchild = -1;
        this.rchild = -1;
        this.parent = -1;
    }
    //第二种构造方法，用来应对两种方式。
    public HTNode(){
        this.lchild = -1;
        this.rchild = -1;
        this.parent = -1;
    }
}
