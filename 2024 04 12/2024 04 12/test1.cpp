#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <queue>
using namespace std;
typedef pair<int, int> PII;
const int N = 1010, M = N * N / 2;
int h[N], e[M], ne[M], w[M], idx;
int d[N][N];
int n, m, k;

void add(int k, int x, int wei)
{
    w[idx] = wei;
    e[idx] = x;
    ne[idx] = h[k];
    h[k] = idx++;
}

void dijsktra()
{
    memset(d, 0x3f, sizeof d);
    d[0][0] = 0;
    priority_queue<PII, vector<PII>, greater<PII> > q;
    q.push({ 0, 0 });

    while (q.size())
    {
        PII t = q.top();
        q.pop();

        for (int i = h[t.second]; ~i; i = ne[i])
        {
            bool flag = false;
            int j = e[i];
            if (d[j][0] > d[t.second][0] + w[i])    //更新未使用魔法时
            {
                d[j][0] = d[t.second][0] + w[i];
                flag = true;
            }

            for (int k1 = 1; k1 <= k; k1++)       //枚举魔法段数
            {
                if (d[j][k1] > d[t.second][k1 - 1])
                {
                    d[j][k1] = d[t.second][k1 - 1];
                    flag = true;
                }
            }

            if (d[j][k] > d[t.second][k] + w[i])
            {
                flag = true;
                d[j][k] = d[t.second][k] + w[i];
            }

            if (flag)   q.push({ d[j][0], j });
        }
    }
}

int main()
{
    scanf("%d%d%d", &n, &k, &m);

    memset(h, -1, sizeof h);
    for (int i = 0; i < m; i++)
    {
        int a, b, wei;
        scanf("%d%d%d", &a, &b, &wei);
        add(a, b, wei);
        add(b, a, wei);
    }

    dijsktra();

    printf("%d", min(d[n - 1][0], d[n - 1][k]));

    return 0;
}