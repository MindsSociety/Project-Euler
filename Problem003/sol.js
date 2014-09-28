n = 600851475143;
for(i = 2; n > 1; n % i ? i++: (n /= i));
document.write(i);
