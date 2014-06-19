(println (reduce + (filter #(or (= (mod % 3) 0) (= (mod % 5) 0)) (range 0 1000 1))))
