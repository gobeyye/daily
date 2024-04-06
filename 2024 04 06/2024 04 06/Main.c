#include<stdio.h>

int fun(int n) {
    int sum = 0;
    while (n) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
int main() {
    int count = 0;
    int i, j, year, month, days[13] = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
    for (year = 1900; year <= 9999; year++) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            days[2] = 29;
        else
            days[2] = 28;
        for (i = 1; i <= 12; i++) {
            for (j = 1; j <= days[i]; j++) {
                if (fun(year) == fun(i) + fun(j))count++; //printf("%d %d %d", year, i, j);
            }
        }
    }
    printf("%d", count);
    return 0;
}