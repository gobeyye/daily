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
    public HTNode(char data,int weight){
        this.data = data;
        this.weight = weight;
        this.lchild = -1;
        this.rchild = -1;
        this.parent = -1;
    }
    public HTNode(){
        this.lchild = -1;
        this.rchild = -1;
        this.parent = -1;
    }
}
