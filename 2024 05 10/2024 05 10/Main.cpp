#define _CRT_SECURE_NO_WARNINGS
#include <Stdio.h>
int main()
{
	int n = 5;
	int l = 0, r = n - 1;//�涨���½�
	int k, c = 1;
	int map[5][5];
 	while (r >= l)
	{
		//˼·���������ǲ㿪ʼ������
		for (k = l; k <= r; k++) map[l][k] = c++;//��
		for (k = l + 1; k <= r; k++) map[k][r] = c++;//��
		for (k = r - 1; k >= l; k--) map[r][k] = c++;//��
		for (k = r - 1; k > l; k--) map[k][l] = c++;//��
		r--;//��д������һ��
		l++;
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			printf("%5d", map[i][j]);
		}
		printf("\n");
	}
}