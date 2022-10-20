#include <iostream>
#include <cstdio>
using namespace std;

int max_of_four(int a, int b, int c, int d) {
    int s1 = max(a,b);
    int s2 = max(c,d);
    int sum = max(s1,s2);
    return sum;
}
int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
  //https://www.hackerrank.com/challenges/c-tutorial-functions/problem
}
