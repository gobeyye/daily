////顺序栈基本运算算法
//#include <stdio.h>
//#include <malloc.h>
//#define MaxSize 100
//typedef char ElemType;
//typedef struct
//{
//	ElemType data[MaxSize];
//	int top;				//栈指针
//} SqStack;					//顺序栈类型
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
//	if (s->top == MaxSize - 1)    //栈满的情况，即栈上溢出
//		return false;
//	s->top++;
//	s->data[s->top] = e;
//	return true;
//}
//bool Pop(SqStack*& s, ElemType& e)
//{
//	if (s->top == -1)		//栈为空的情况，即栈下溢出
//		return false;
//	e = s->data[s->top];
//	s->top--;
//	return true;
//}
//bool GetTop(SqStack* s, ElemType& e)
//{
//	if (s->top == -1) 		//栈为空的情况，即栈下溢出
//		return false;
//	e = s->data[s->top];
//	return true;
//}
//void main()
//{
//	ElemType e;
//	SqStack* s;
//	InitStack(s);
//	printf("栈s空否: %d\n", StackEmpty(s));
//	Push(s, 'a');
//	Push(s, 'b');
//	Push(s, 'c');
//	Push(s, 'd');
//	Push(s, 'e');
//	printf("栈s空否: %d\n", StackEmpty(s));
//	printf("出栈顺序: ");
//	while (!StackEmpty(s))
//	{
//		Pop(s, e);
//		printf("%c ", e);
//	}
//
//	printf("\n栈s空否: %d\n", StackEmpty(s));
//	printf("\n");
//	DestroyStack(s);
//}
//
