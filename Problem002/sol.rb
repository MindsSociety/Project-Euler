x, y, result = 1, 1, 0

while result < 4_000_000
  result += (x + y)
  x, y = x + 2*y, 2*x + 3*y
end

puts result
