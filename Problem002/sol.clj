(def fibo (iterate (fn [[a b]] [b (+ a b)]) [0 1]))
(println (reduce + (filter even? (rest (take-while #(< % 4000000) (map #(nth % 1) fibo))))))
