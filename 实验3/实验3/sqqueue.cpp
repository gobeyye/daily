////顺序队列（环形队列）基本运算算法
//#include <stdio.h>
//#include <malloc.h>
//#define MaxSize 100
//typedef char ElemType;
//typedef struct
//{
//	ElemType data[MaxSize];
//	int front, rear;		//队首和队尾指针
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
//	if ((q->rear + 1) % MaxSize == q->front)	//队满上溢出
//		return false;
//	q->rear = (q->rear + 1) % MaxSize;
//	q->data[q->rear] = e;
//	return true;
//}
//int Count(SqQueue*& q)					//求队列中的元素个数 
//{
//	return (q->rear - q->front + MaxSize) % MaxSize;
//}
//bool deQueue(SqQueue*& q, ElemType& e)
//{
//	if (q->front == q->rear)		//队空下溢出
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
//	printf("队列是否为空：%d\n", QueueEmpty(q));
//	enQueue(q, 'a');
//	enQueue(q, 'b');
//	enQueue(q, 'c');
//	deQueue(q, e);
//	printf("该元素为：%c\n", e);
//	enQueue(q, 'd');
//	enQueue(q, 'e');
//	enQueue(q, 'f');
//	printf("出队序列如下：\n");
//	while (!QueueEmpty(q))
//	{
//		deQueue(q, e);
//		printf("%c ", e);
//	}
//	DestroyQueue(q);
//}
