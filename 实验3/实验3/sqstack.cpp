////˳��ջ���������㷨
//#include <stdio.h>
//#include <malloc.h>
//#define MaxSize 100
//typedef char ElemType;
//typedef struct
//{
//	ElemType data[MaxSize];
//	int top;				//ջָ��
//} SqStack;					//˳��ջ����
//void InitStack(SqStack*& s)
//{
//	s = (SqStack*)malloc(sizeof(SqStack));
//	s->top = -1;
//}
//void DestroyStack(SqStack*& s)
//{
//	free(s);
//}
//bool StackEmpty(SqStack* s)
//{
//	return(s->top == -1);
//}
//bool Push(SqStack*& s, ElemType e)
//{
//	if (s->top == MaxSize - 1)    //ջ�����������ջ�����
//		return false;
//	s->top++;
//	s->data[s->top] = e;
//	return true;
//}
//bool Pop(SqStack*& s, ElemType& e)
//{
//	if (s->top == -1)		//ջΪ�յ��������ջ�����
//		return false;
//	e = s->data[s->top];
//	s->top--;
//	return true;
//}
//bool GetTop(SqStack* s, ElemType& e)
//{
//	if (s->top == -1) 		//ջΪ�յ��������ջ�����
//		return false;
//	e = s->data[s->top];
//	return true;
//}
//void main()
//{
//	ElemType e;
//	SqStack* s;
//	InitStack(s);
//	printf("ջs�շ�: %d\n", StackEmpty(s));
//	Push(s, 'a');
//	Push(s, 'b');
//	Push(s, 'c');
//	Push(s, 'd');
//	Push(s, 'e');
//	printf("ջs�շ�: %d\n", StackEmpty(s));
//	printf("��ջ˳��: ");
//	while (!StackEmpty(s))
//	{
//		Pop(s, e);
//		printf("%c ", e);
//	}
//
//	printf("\nջs�շ�: %d\n", StackEmpty(s));
//	printf("\n");
//	DestroyStack(s);
//}
//
