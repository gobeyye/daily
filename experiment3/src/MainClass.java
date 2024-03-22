/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 13:08
 */
public class MainClass {
    public static void main(String args[]) {
        Village zhaoZhuang,maJiaHeZhi;
        zhaoZhuang = new Village("赵庄");
        maJiaHeZhi = new Village("马家河子");
        zhaoZhuang.peopleNumber=100;
        maJiaHeZhi.peopleNumber=150;
        Village.treeAmount = 200;//用类名Village访问treeAmount,并赋值200
        int leftTree =Village.treeAmount;
        System.out.println("森林中有 "+leftTree+" 颗树");
        zhaoZhuang.treePlanting(50);//zhaoZhuang调用treePlanting(int n),并向参数传值50
        leftTree = maJiaHeZhi.lookTreeAmount();//maJiaHeZhi调用lookTreeAmount()方法得到树木的数量
        System.out.println("森林中有 "+leftTree+" 颗树");
       //【代码4】maJiaHeZhi调用fellTree(int n),并向参数传值70
        maJiaHeZhi.fellTree(70);
        leftTree = Village.lookTreeAmount();
        System.out.println("森林中有 "+leftTree+" 颗树");
        System.out.println("赵庄的人口:"+zhaoZhuang.peopleNumber);
        zhaoZhuang.addPeopleNumber(12);
        System.out.println("赵庄的人口:"+zhaoZhuang.peopleNumber);
        System.out.println("马家河子的人口:"+maJiaHeZhi.peopleNumber);
        maJiaHeZhi.addPeopleNumber(10);
        System.out.println("马家河子的人口:"+maJiaHeZhi.peopleNumber);
    }
}
