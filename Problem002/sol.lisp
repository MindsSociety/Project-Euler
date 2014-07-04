(defun fib (x &optional (y 0) (z 1))
       (if (< x z)
            nil
            (append (list z) (fib x z (+ y z)))))

(reduce #'+ (remove-if-not #'evenp (fib 4000000)))
