local value = 600851475143
local nvalue = value
local factor = 2
local primeFactor = 0

while factor * factor <= nvalue do
    if nvalue % factor == 0 then
		nvalue = nvalue / factor
		primeFactor = factor
	else
		factor = factor + 1
	end
end

if nvalue > primeFactor then
	primeFactor = nvalue
end

print(primeFactor)
os.execute('pause')
