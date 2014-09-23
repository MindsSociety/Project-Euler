#include<iostream>

using namespace std;

int i = 2;

int remleastprime(long long int&x) {
    for(;; i++) {
        if(x % i == 0) {
            break;
        }
    }
    
    for(; x % i == 0;) {
        if(x == i) {
            return 0;
        }
        
        x /= i;
    }
    
    return 1;
}

int main() {
    int j = 1;
    long long int a = 600851475143;
    
    for(; j == 1;) {
        j = remleastprime(a);
    }
    
    cout << a << endl;
    
    return 0;
}
