let rec isprime (x:int64) i =
    if (i < (x / 2L)) then
        if (x % i = 0L) then
            false
        else
            isprime x (i + 1L)
            
    else
        true
        
let primefactor (x:int64) = 
    let mutable i:int64 = 2L
    let mutable n:int64 = x
    let mutable highest:int64 = 1L
    
    while (i < x) do
        if (x % i = 0L) then
            let testprime:int64 = x / i
            
            if (isprime testprime 2L) then
                highest <- testprime
                
                n <- n / i
                
                i <- 2L
                
        if (highest = 1L) then
            i <- i + 1L
        else
            i <- x
            
    highest
    
printfn "%d" (primefactor 600851475143L)
