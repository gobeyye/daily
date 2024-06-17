package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 13:14
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1. 读入英文或者中文
        menu();
        int key = in.nextInt();
        in.nextLine();
        while(key == 1){
            System.out.println("---------------------------------------");
            System.out.println("请输入要编码字母：");
            String s = in.nextLine();//读入的数据
            Map<Character,Integer> hash = new HashMap<>();//统计字符
            //2. 将个个字符统计，转化成哈夫曼树节点
            for(int i = 0;i < s.length();i++){
                hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0) + 1);
            }
            int size = hash.size();//字符种类个数
            HTNode[] nodes = new HTNode[size * 2 - 1];//哈夫曼树节点
            int j = 0;
            for(Map.Entry<Character,Integer> entry:hash.entrySet()){
                nodes[j++] = new HTNode(entry.getKey(),entry.getValue());
            }
            //创建 剩下的节点
            for(int i = j;i < size * 2 - 1;i++){
                nodes[i] = new HTNode();
            }
            //3. 构成哈夫曼树
            Tree.createHT(nodes,size);
            //4. 生成哈夫曼编码
            HCode[] codes;
            codes = Tree.CreateHCode(nodes,size);
            //5. 根据各个字符的哈夫曼编码来进行编码
            Map<Character,String> map1 = new HashMap<>();
            for(int i = 0;i < size;i++){
                map1.put(codes[i].data,codes[i].cd.toString());
            }
            String ret = tranFor(map1,s);//哈夫曼编码
            //6.解码
            //翻转过来
            Map<String,Character> map2 = new HashMap<>();
            for(Map.Entry<Character,String> entry:map1.entrySet()){
                map2.put(entry.getValue(),entry.getKey());
            }
            String ans = unTranFor(map2,ret);
            System.out.println("解码为：" + ans);
            System.out.println("您是否想要查看对应的编码规则? 1:查看 2:忽视");
            int judge = in.nextInt();
            in.nextLine();//消去空格
            if(judge == 1){
                //查看
                for(Map.Entry<Character,String> entry:map1.entrySet()){
                    System.out.println("原字符          出现次数            哈夫曼编码");
                    System.out.println(entry.getKey()+"                " +
                            hash.get(entry.getKey()) + "                "+ entry.getValue());
                }
            }
            System.out.println("是否还要继续编码？ 1：继续   2：退出");
            key = in.nextInt();
            in.nextLine();
        }
        System.out.println("程序正在退出~~~~~");
    }
    //菜单
    public static void menu(){
        System.out.println("👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑👑");
        System.out.println("************欢迎使用哈夫曼编码转换器****************");
        System.out.println("******您可以输入任意字母转化成对应的哈夫曼编码************");
        System.out.println("***********输入 1：开始程序 2：退出程序*******************");
        System.out.print("请选择：");
    }
    /**
     *
     * @param map2 是 map1 key 和 value 交换结果
     * @param tmp 哈夫曼编码
     * @return 哈夫曼编码的解码
     */
    public static String unTranFor(Map map2,String tmp){
        StringBuilder sd = new StringBuilder();//用来临时比较
        StringBuilder retrans = new StringBuilder();//最终答案
        for(int i = 0;i < tmp.length();i++){
            sd.append(tmp.charAt(i));
            if(map2.containsKey(sd.toString())){//和 map2 中的元素做比较
                retrans.append(map2.get(sd.toString()));
                sd = new StringBuilder();
            }
        }
        return retrans.toString();
    }
    /**
     *
     * @param map1 存储哈夫曼编码的规则
     * @param s 最开始输入
     * @return 哈夫曼编码结果
     */
    public static String tranFor(Map map1,String s){
        StringBuilder ret = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            ret.append(map1.get(s.charAt(i)));
        }
        System.out.println("哈夫曼编码为：" + ret);
        return ret.toString();
    }
}
