#include <stdio.h>
#include <stdbool.h>

bool isprime(unsigned long long v);

int main(void) {
    unsigned long long num = 600851475143;
    unsigned long long max = 0;
    unsigned long long x;
    
    for(x = 2 ; (x * x) <= num ; x++) {
        if((num % x) == 0) {
            if(isprime(x)) {
                if(x > max) {
                    max = x;
                }
            }
        }
    }
    
    printf("Answer = %llu\n", max);
    
    return 0;
}

bool isprime(unsigned long long v)
{
    unsigned long long i = 0;
    bool rv = true;
    
    if(v != 1) {
        for(i = 2 ; i <= (v / 2) ; i++) {
            if(v % i == 0) {
                rv = false;
            } 
        }
    } else {
        rv = false;
    }
    
    return rv;
}
