local result = 0
local a, b = 1, 1

while a < 4000000 do
  a, b = b, a + b
  if a % 2 == 0 then
    result = result + a
  end
end

print(result)
