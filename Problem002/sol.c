#include <stdio.h>

int main(int argc, char *argv[]) {
    double mcp2(double limit);
    printf("--- %.1f\n", mcp2(4000000.0));
    return 0;
}

double mcp2(double limit) {
    register double a = 1;
    register double b = 1;
    register double c = a + b;
    double sum = 0;
    
    while(c < limit) {
        sum += c;
        a = b + c;
        b = c + a;
        c = a + b;
    }
    
    return sum;
}
