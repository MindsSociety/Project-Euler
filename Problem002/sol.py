x = y = 1
result = 0

while (result < 4000000):
	result += (x + y)
	x, y = x + 2 * y, 2 * x + 3 * y
  
print result
