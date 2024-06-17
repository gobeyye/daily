/*
 *���������������б�����빦��
 */

#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <errno.h>
#include <stdlib.h>
#define  ARTICLE_CHAR_NUM_MAX  100
#define  ARTICLE_CHAR_TYPE     37

 //������������Ĵ洢�ṹ
typedef struct
{
    char data;    //����ֵ
    int weight;   //����Ȩֵ
    int parent;   //����˫��
    int lch;      //����
    int rch;      //�Һ���
}HuffNode;

//�������������Ĵ洢�ṹ
typedef struct
{
    char bit[ARTICLE_CHAR_TYPE];//�洢Ҷ�ӽ��Ķ����Ʊ���
    int start;    //�����Ʊ������ʼλ
}HuffCode;

/*
 *��ȡ�������ݲ���һ������
 *���������ԭ�ĵĵ�ַ,�����������ݵĵ�ַ
 *����ֵ����
 * */
void get_article_content(char str[], char art_content[])
{
    int art_fd;
    int ret, i;
    art_fd = open(str, O_RDONLY);
    for (i = 0;; i++) {
        ret = read(art_fd, art_content + i, 1);
        if (-1 == ret) {
            perror("read article error!");
            exit(-1);
        }
        else if (0 == ret) {
            break;
        }
    }
    art_content[i] = '\0';
    printf("%s\n", art_content);

    for (i = 0; i < strlen(art_content); i++) {
        if (art_content[i] >= 'A' && art_content[i] <= 'Z') {
            art_content[i] = art_content[i] + 32;
        }
        else if ((art_content[i] >= '0' && art_content[i] <= '9') ||
            (art_content[i] >= 'a' && art_content[i] <= 'z')) {
            continue;
        }
        else if (art_content[i] != '\0') {
            art_content[i] = ' ';
        }
        else
            break;
    }
    printf("%s\n", art_content);
    close(art_fd);
}
/*
 *��������ַ���Ȩֵ
 *��������������������ݵ�����ָ�룬����Ȩֵ������ָ��
 *����ֵ����
 * */
void cal_weight(char art_content[], char* weight)
{
    int i;
    memset(weight, 0, ARTICLE_CHAR_TYPE);
    for (i = 0; i < strlen(art_content); i++) {
        //0~25���Ӧa~z
        if (art_content[i] >= 'a' && art_content[i] <= 'z')
            weight[art_content[i] - 'a']++;
        //36��ո� 
        else if (art_content[i] == ' ')
            weight[36]++;
        //26~35��0~9
        else if (art_content[i] >= '0' && art_content[i] <= '9')
            weight[art_content[i] - '0' + 26]++;
        else
            break;
    }
    for (i = 0; i < ARTICLE_CHAR_TYPE; i++)
        printf("%d  ", weight[i]);
    putchar('\n');
}

/*
 *�����������
 *�������������Ȩֵ������ָ��
 *����ֵ����
 * */
void HuffmanTree(HuffNode ht[], char weight[])
{
    int i, k, left, right, min1, min2;


    //�Թ��������еĽ����г�ʼ��
    for (i = 0; i < 2 * ARTICLE_CHAR_TYPE; i++) {
        ht[i].parent = ht[i].lch = ht[i].rch = -1;
    }
    for (i = 0; i < 2 * ARTICLE_CHAR_TYPE; i++) {
        if (i < 26) {
            ht[i].data = 'a' + i;
            ht[i].weight = (int)weight[i];
        }
        else if (i < 36) {
            ht[i].data = i - 26 + '0';
            ht[i].weight = (int)weight[i];
        }
        else if (i == 36) {
            ht[i].data = ' ';
            ht[i].weight = (int)weight[i];
        }
        else if (i < 2 * ARTICLE_CHAR_TYPE - 1) {
            ht[i].data = 0;
        }
    }

    for (i = ARTICLE_CHAR_TYPE; i < 2 * ARTICLE_CHAR_TYPE - 1; i++) {
        //��ǰn�������ѡȡȨֵ��С��������㹹��һ�Ŷ�����
        min1 = min2 = 100;
        left = right = -1;
        for (k = 0; k < i; k++) {
            if (ht[k].parent == -1) {
                //��min1��min2Ϊ��С������Ȩֵ��left��rightΪȨֵ��С��
                //��������λ��
                if (ht[k].weight < min1) {
                    min2 = min1;
                    right = left;
                    min1 = ht[k].weight;
                    left = k;
                }
                else if (ht[k].weight < min2) {
                    min2 = ht[k].weight;
                    right = k;
                }
            }

        }

        //���ҵ���������㹹��һ�Ŷ�����
        ht[left].parent = i;        //�ҵ�����������˫��Ϊi
        ht[right].parent = i;
        ht[i].weight = ht[left].weight + ht[right].weight;//i��ȨֵΪ������
        //��Ȩֵ֮��
            ht[i].lch = left;
        ht[i].rch = right;
    }
}
/*
 * �������������
 *���������������������ṹ������ָ��,��������
 *�����������
*/


void HuffmanCode(HuffNode ht[], char art_content[])
{
    int i, j, c, k, f;
    int len = strlen(art_content);
    HuffCode cd[len];
    for (j = 0; j < len; j++) {

        for (i = 0; i < ARTICLE_CHAR_TYPE; i++) {
            if (art_content[j] == ht[i].data) {

                cd[j].start = ARTICLE_CHAR_TYPE - 1;
                c = i;
                f = ht[i].parent;
                while (f != -1) {
                    if (ht[f].lch == c)
                        cd[j].bit[cd[j].start] = '0';
                    else
                        cd[j].bit[cd[j].start] = '1';
                    cd[j].start--;
                    c = f;
                    f = ht[f].parent;
                }
                cd[j].bit[cd[j].start] = '0';
            }
        }
    }

    int fd = open("./ciphertext.txt", O_WRONLY | O_CREAT | O_TRUNC);
    if (-1 == fd) {
        perror("open ciphertext.txt error!");
        exit(-1);
    }
    int ret;
    for (j = 0; j < len; j++) {

        ret = write(fd, cd[j].bit + cd[j].start, ARTICLE_CHAR_TYPE - cd[j].start);
        if (-1 == ret) {
            perror("write ciphertext.txt error!");
            exit(-1);
        }
    }
    close(fd);
}

/*
 *����������
 *����������������ṹ�����ĵ�ַ
 *����ֵ����
 * */
void HuffRecode(HuffNode ht[], char str[])
{
    int fd_cipher, fd_recd;
    int f_size;
    int i, j, k, root, dest;
    char recode_art[ARTICLE_CHAR_NUM_MAX];
    //������
    fd_cipher = open(str, O_RDONLY);
    if (fd_cipher == -1) {
        perror("open ciphertext error!");
        exit(-1);
    }
    //�򿪻򴴽�����
    fd_recd = open("./new_article.txt", O_WRONLY | O_CREAT | O_TRUNC);
    if (fd_recd == -1) {
        perror("open new_article.txt error!");
        exit(-1);
    }
    //�����ļ���С�����ڿ��ٴ洢�������ݵĿռ䣬Ȼ���������ݴ���ÿռ�
    f_size = lseek(fd_cipher, 0, SEEK_END);
    char* cipher_content = (char*)malloc(sizeof(char) * f_size);
    lseek(fd_cipher, 0, SEEK_SET);
    for (i = 0; i < f_size; i++) {
        read(fd_cipher, cipher_content + i, 1);
    }

    //����
    //�ҵ������
    for (j = 0; j < 2 * ARTICLE_CHAR_TYPE - 1; j++) {
        if (-1 == ht[j].parent) {
            root = j;
            break;
        }
    }

    //�ҵ�Ŀ����
    k = 0;
    for (i = 1; i < f_size; i++) {
        dest = root;
        j = root;
        do {
            if (cipher_content[i] == '0')
                dest = ht[j].lch;
            else if (cipher_content[i] == '1')
                dest = ht[j].rch;
            j = dest;
            i++;
        } while (ht[dest].data == '\0');
        //�����������������
        recode_art[k++] = ht[dest].data;
    }
    recode_art[k] = '\0';
    printf("%s\n", recode_art);
    //�����ı��浽�ļ���
    int ret = write(fd_recd, recode_art, strlen(recode_art));
    if (-1 == ret) {
        perror("write new_article error! ");
        exit(-1);
    }
    close(fd_recd);
    close(fd_cipher);
}


int main(void)
{
    char art[ARTICLE_CHAR_NUM_MAX];
    char weight[ARTICLE_CHAR_TYPE];
    HuffNode ht[2 * ARTICLE_CHAR_TYPE];
    HuffCode hcd[ARTICLE_CHAR_TYPE];

    get_article_content("./article.txt", art);
    cal_weight(art, weight);
    HuffmanTree(ht, weight);
    HuffmanCode(ht, art);
    HuffRecode(ht, "./ciphertext.txt");
    return 0;
}
