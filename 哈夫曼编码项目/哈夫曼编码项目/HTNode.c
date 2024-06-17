#define  _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
typedef struct
{
	char data;//节点值
	double weight;//权重
	int parent;//父亲节点
	int lchild;//左孩子节点
	int rchild;//右孩子节点
}HTNode;
#define N 1000
typedef struct
{
	char cd[N];//存储哈夫曼编码
	int start;//表示哈夫曼编码的开始位置
}HCode;

//创建哈夫曼树
//调试完毕
//参数说明：ht 表示传入的叶子节点，n 表示叶子节点数
//作用：构建哈夫曼树，存储在 ht 中。
void createHT(HTNode ht[], int n)
{
	//初始化
	int k = 0;//用来后续查找最小的两个叶子节点的权值下标
	int total = 2 * n - 1;//表示全部节点数
	double minl, minr;//存储区间内最小权值的两个节点
	int lnode, rnode;//存储最小权值的两个节点在数组中的下标
	for (int i = 0; i < total; i++) ht[i].parent = ht[i].lchild = ht[i].rchild = -1;//都初始化为 -1 ，表示叶子节点
	//开始创建
	for (int i = n; i < total; i++)
	{
		//要找最小，所以刚开始要初始化为 最大
		minl = 0x3f3f3f3f, minr = 0x3f3f3f3f;//minl 是最小的，minr 是次小的权值
		lnode = rnode = -1;//存储最小权值对应的下标
		for (k = 0; k <= i - 1; k++)
		{
			if (ht[k].parent == -1)
			{
				if (ht[k].weight < minl) //如果比 minl 还小的话，两个存储值都要改变
				{
					minr = minl, rnode = lnode;
					minl = ht[k].weight; lnode = k;
				}
				else if (ht[k].weight < minr) { //走到这里说明 minl 小于 ht[k].weight，所以只需要修改 minr 即可
					minr = ht[k].weight; rnode = k;
				}
			}
		}
		// i 表示 合并新节点的下标
		// lchild 表示被合并的左节点
		// rchild 表示被合并的右节点
		ht[i].weight = ht[lnode].weight + ht[rnode].weight;
		ht[i].lchild = lnode; ht[i].rchild = rnode;
		ht[lnode].parent = i; ht[rnode].parent = i;
	}
}
//进行哈夫曼编码
//参数说明：ht 哈夫曼树，hcd 要填的哈夫曼编码，n 叶子节点个数
//作用：进行哈夫曼编码，填写到 hcd
void CreateHCode(HTNode ht[], HCode hcd[], int n) {
	HCode tmp;
	int parent; int cur;
	for (int i = 0; i < n; i++)
	{
		tmp.start = n - 1;
		cur = i;
		parent = ht[cur].parent;
		while (parent != -1)
		{
			if (cur == ht[parent].lchild)
			{
				//是左孩子
				tmp.cd[tmp.start--] = '0';
			}
			else
			{
				//右孩子
				tmp.cd[tmp.start--] = '1';
			}
			cur = parent;
			parent = ht[cur].parent;
		}
		tmp.start++;//恢复原来位置
		hcd[i] = tmp;
	}
}
//调试完毕
//参数说明：hcd 就是哈夫曼编码，n 是叶子节点个数
//功能：打印出 n 个叶子节点的哈夫曼编码
void printHCode(HCode hcd[], int n) {
	int end = n - 1;
	for (int i = 0; i < n; i++) {
		HCode cur = hcd[i];
		for (int j = cur.start; j <= end; j++) {
			printf("%c ", cur.cd[j]);
		}
		printf("\n");
	}
}


int main()
{

	//1. 读入英文或者中文
	char string[10000] = "take";
	//2. 将个个字符统计，转化成哈夫曼树节点
	//3. 构成哈夫曼树
	//4. 生成哈夫曼编码
	//5. 根据各个字符的哈夫曼编码来进行编码
	//6. 解码

}
