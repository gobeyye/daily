////˳����У����ζ��У����������㷨
//#include <stdio.h>
//#include <malloc.h>
//#define MaxSize 100
//typedef char ElemType;
//typedef struct
//{
//	ElemType data[MaxSize];
//	int front, rear;		//���׺Ͷ�βָ��
//} SqQueue;
//void InitQueue(SqQueue*& q)
//{
//	q = (SqQueue*)malloc(sizeof(SqQueue));
//	q->front = q->rear = 0;
//}
//void DestroyQueue(SqQueue*& q)
//{
//	free(q);
//}
//bool QueueEmpty(SqQueue* q)
//{
//	return(q->front == q->rear);
//}
//bool enQueue(SqQueue*& q, ElemType e)
//{
//	if ((q->rear + 1) % MaxSize == q->front)	//���������
//		return false;
//	q->rear = (q->rear + 1) % MaxSize;
//	q->data[q->rear] = e;
//	return true;
//}
//int Count(SqQueue*& q)					//������е�Ԫ�ظ��� 
//{
//	return (q->rear - q->front + MaxSize) % MaxSize;
//}
//bool deQueue(SqQueue*& q, ElemType& e)
//{
//	if (q->front == q->rear)		//�ӿ������
//		return false;
//	q->front = (q->front + 1) % MaxSize;
//	e = q->data[q->front];
//	return true;
//}
//int main()
//{
//	ElemType e;
//	SqQueue* q;
//	InitQueue(q);
//	printf("�����Ƿ�Ϊ�գ�%d\n", QueueEmpty(q));
//	enQueue(q, 'a');
//	enQueue(q, 'b');
//	enQueue(q, 'c');
//	deQueue(q, e);
//	printf("��Ԫ��Ϊ��%c\n", e);
//	enQueue(q, 'd');
//	enQueue(q, 'e');
//	enQueue(q, 'f');
//	printf("�����������£�\n");
//	while (!QueueEmpty(q))
//	{
//		deQueue(q, e);
//		printf("%c ", e);
//	}
//	DestroyQueue(q);
//}
