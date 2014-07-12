(define remove-if
  (lambda (filter-fn lst)
    (if (null? lst)
      '()
      (if (filter-fn (car lst))
        (remove-if filter-fn (cdr lst))
        (cons (car lst)(remove-if filter-fn (cdr lst)))))))
        
(define even?
  (lambda (n)
    (= (modulo n 2) 0)))
    
(define odd?
  (lambda (n)
    (even? (- n 1))))
    
(define make-fib-list
  (lambda (end)
    (rec-fib-list 0 1 end)))
    
(define rec-fib-list
  (lambda (t1 t2 end)
    (if (> (+ t1 t2) end)
      (list t1 t2)
      (cons t1 (rec-fib-list t2 (+ t1 t2) end)))))


(display (apply + (remove-if odd? (make-fib-list 4000000))))
