////��ջ���������㷨
//#include <stdio.h>
//#include <malloc.h>
//typedef char ElemType;
//typedef struct linknode
//{
//	ElemType data;				//������
//	struct linknode* next;		//ָ����
//} LinkStNode;					//��ջ����
//void InitStack(LinkStNode*& s)
//{
//	s = (LinkStNode*)malloc(sizeof(LinkStNode));
//	s->next = NULL;
//}
//void DestroyStack(LinkStNode*& s)
//{
//	LinkStNode* p = s->next;
//	while (p != NULL)
//	{
//		free(s);
//		s = p;
//		p = p->next;
//	}
//	free(s);	//sָ��β���,�ͷ���ռ�
//}
//bool StackEmpty(LinkStNode* s)
//{
//	return(s->next == NULL);
//}
//void Push(LinkStNode*& s, ElemType e)
//{
//	LinkStNode* p;
//	p = (LinkStNode*)malloc(sizeof(LinkStNode));
//	p->data = e;				//�½�Ԫ��e��Ӧ�Ľ��p
//	p->next = s->next;		//����p�����Ϊ��ʼ���
//	s->next = p;
//}
//bool Pop(LinkStNode*& s, ElemType& e)
//{
//	LinkStNode* p;
//	if (s->next == NULL)		//ջ�յ����
//		return false;
//	p = s->next;				//pָ��ʼ���
//	e = p->data;
//	s->next = p->next;		//ɾ��p���
//	free(p);				//�ͷ�p���
//	return true;
//}
//int GetLength(LinkStNode* s)
//{
//	int count = 0;
//	s = s->next;//���Ǵ�ͷ�ڵ��
//	while (s != NULL) {
//		count++;
//		s = s->next;
//	}
//	return count;
//}
//bool GetTop(LinkStNode* s, ElemType& e)
//{
//	if (s->next == NULL)		//ջ�յ����
//		return false;
//	e = s->next->data;
//	return true;
//}
//int main()
//{
//	ElemType e;
//	LinkStNode* s;
//	InitStack(s);
//	printf("ջs�շ�: %d\n", StackEmpty(s));
//	Push(s, 'a');
//	Push(s, 'b');
//	Push(s, 'c');
//	Push(s, 'd');
//	Push(s, 'e');
//	printf("ջs�շ�: %d\n", StackEmpty(s));
//	printf("��ջ�ĳ���Ϊ��%d\n", GetLength(s));
//	printf("�����ջ����ջ�׺��������ջ��һ�������£�\n");
//	printf("��ջ˳��: ");
//	while (!StackEmpty(s))
//	{
//		Pop(s, e);
//		printf("%c ", e);
//	}
//	printf("\nջs�շ�: %d\n", StackEmpty(s));
//	printf("\n");
//	DestroyStack(s);
//}