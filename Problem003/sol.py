from math import sqrt

primes = set([2])
value = 3
result = 600851475143

while value < sqrt(result):
  isPrime = True
  
  for k in primes:
    if value % k == 0:
      isPrime = False
      value += 2
    
  if isPrime:
    primes.add(value)
    
    if result % value == 0:
      result /= value
      
print result
