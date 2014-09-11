def factorize(x)
    factors = {}
    factors.default = 0    
    n = x
    i = 2
    sqi = 4 
    
    while sqi <= n do
        while n.modulo(i) == 0 do
            n /= i
            factors[i] += 1
        end
        
        sqi += 2 * i + 1
        i += 1
    end
    
    if (n != 1) && (n != x)
        factors[n] += 1
    end
    
    factors.to_a
end

p factorize(600851475143).max[0]
