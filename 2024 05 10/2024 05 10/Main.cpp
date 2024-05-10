#define _CRT_SECURE_NO_WARNINGS
#include <Stdio.h>
int main()
{
	int n = 5;
	int l = 0, r = n - 1;//规定上下界
	int k, c = 1;
	int map[5][5];
 	while (r >= l)
	{
		//思路从最外面那层开始填数据
		for (k = l; k <= r; k++) map[l][k] = c++;//上
		for (k = l + 1; k <= r; k++) map[k][r] = c++;//右
		for (k = r - 1; k >= l; k--) map[r][k] = c++;//下
		for (k = r - 1; k > l; k--) map[k][l] = c++;//左
		r--;//填写里面那一层
		l++;
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			printf("%5d", map[i][j]);
		}
		printf("\n");
	}
}