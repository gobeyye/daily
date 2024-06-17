#define  _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
typedef struct
{
	char data;//�ڵ�ֵ
	double weight;//Ȩ��
	int parent;//���׽ڵ�
	int lchild;//���ӽڵ�
	int rchild;//�Һ��ӽڵ�
}HTNode;
#define N 1000
typedef struct
{
	char cd[N];//�洢����������
	int start;//��ʾ����������Ŀ�ʼλ��
}HCode;

//������������
//�������
//����˵����ht ��ʾ�����Ҷ�ӽڵ㣬n ��ʾҶ�ӽڵ���
//���ã����������������洢�� ht �С�
void createHT(HTNode ht[], int n)
{
	//��ʼ��
	int k = 0;//��������������С������Ҷ�ӽڵ��Ȩֵ�±�
	int total = 2 * n - 1;//��ʾȫ���ڵ���
	double minl, minr;//�洢��������СȨֵ�������ڵ�
	int lnode, rnode;//�洢��СȨֵ�������ڵ��������е��±�
	for (int i = 0; i < total; i++) ht[i].parent = ht[i].lchild = ht[i].rchild = -1;//����ʼ��Ϊ -1 ����ʾҶ�ӽڵ�
	//��ʼ����
	for (int i = n; i < total; i++)
	{
		//Ҫ����С�����Ըտ�ʼҪ��ʼ��Ϊ ���
		minl = 0x3f3f3f3f, minr = 0x3f3f3f3f;//minl ����С�ģ�minr �Ǵ�С��Ȩֵ
		lnode = rnode = -1;//�洢��СȨֵ��Ӧ���±�
		for (k = 0; k <= i - 1; k++)
		{
			if (ht[k].parent == -1)
			{
				if (ht[k].weight < minl) //����� minl ��С�Ļ��������洢ֵ��Ҫ�ı�
				{
					minr = minl, rnode = lnode;
					minl = ht[k].weight; lnode = k;
				}
				else if (ht[k].weight < minr) { //�ߵ�����˵�� minl С�� ht[k].weight������ֻ��Ҫ�޸� minr ����
					minr = ht[k].weight; rnode = k;
				}
			}
		}
		// i ��ʾ �ϲ��½ڵ���±�
		// lchild ��ʾ���ϲ�����ڵ�
		// rchild ��ʾ���ϲ����ҽڵ�
		ht[i].weight = ht[lnode].weight + ht[rnode].weight;
		ht[i].lchild = lnode; ht[i].rchild = rnode;
		ht[lnode].parent = i; ht[rnode].parent = i;
	}
}
//���й���������
//����˵����ht ����������hcd Ҫ��Ĺ��������룬n Ҷ�ӽڵ����
//���ã����й��������룬��д�� hcd
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
				//������
				tmp.cd[tmp.start--] = '0';
			}
			else
			{
				//�Һ���
				tmp.cd[tmp.start--] = '1';
			}
			cur = parent;
			parent = ht[cur].parent;
		}
		tmp.start++;//�ָ�ԭ��λ��
		hcd[i] = tmp;
	}
}
//�������
//����˵����hcd ���ǹ��������룬n ��Ҷ�ӽڵ����
//���ܣ���ӡ�� n ��Ҷ�ӽڵ�Ĺ���������
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

	//1. ����Ӣ�Ļ�������
	char string[10000] = "take";
	//2. �������ַ�ͳ�ƣ�ת���ɹ��������ڵ�
	//3. ���ɹ�������
	//4. ���ɹ���������
	//5. ���ݸ����ַ��Ĺ��������������б���
	//6. ����

}
