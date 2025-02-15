//文件名:exp4-4.cpp
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#define MaxSize 100
typedef struct
{
	char data[MaxSize];
	int length;			//串长
} SqString;
extern void StrAssign(SqString&, char[]);	//在algo4-1.cpp文件中
extern void DispStr(SqString);
SqString A, B;								//全局串
SqString EnCrypt(SqString p)
{
	int i = 0, j;
	SqString q;
	while (i < p.length)
	{
		for (j = 0; p.data[i] != A.data[j]; j++);
		if (j >= p.length)			//在A串中未找到p.data[i]字母
			q.data[i] = p.data[i];
		else						//在A串中找到p.data[i]字母
			q.data[i] = B.data[j];
		i++;
	}
	q.length = p.length;
	return q;
}
SqString UnEncrypt(SqString q)
{
	int i = 0, j;
	SqString p;
	while (i < q.length)
	{
		for (j = 0; q.data[i] != B.data[j]; j++);
		if (j >= q.length)			//在B串中未找到q.data[i]字母
			p.data[i] = q.data[i];
		else					//在B串中找到q.data[i]字母
			p.data[i] = A.data[j];
		i++;
	}
	p.length = q.length;
	return p;
}
void main()
{
	SqString p, q;
	int ok = 1;
	char s1[] = "abcdefghijklmnopqrstuvwxyz";
	char s2[] = "ngzqtcobmuhelkpdawxfyivrsj";
	StrAssign(A, s1);	//建立A串
	StrAssign(B, s2);	//建立B串
	char str[MaxSize];
	printf("\n");
	printf("输入原文串:");	
	scanf("%s", str);//获取用户输入的原文串
	StrAssign(p, str);							//建立p串
	printf("加密解密如下:\n");
	printf("  原文串:"); DispStr(p);
	q = EnCrypt(p);								//p串加密产生q串
	printf("  加密串:"); DispStr(q);
	p = UnEncrypt(q);							//q串解密产生p串
	printf("  解密串:"); DispStr(p);
	printf("\n");
}
