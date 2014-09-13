(defun solve (n)
  (do ((i (floor (sqrt n)) (decf i)))
      ((and (= 0 (mod n i)) (primep i)) i)))

(defun primep (n)
  (cond ((= 2 n) t)
  ((evenp n) 'nil)
  (t (let ((limit (floor (sqrt n))))
	     (do ((i 3 (incf i 2)))
		 ((> i limit) t)
	       (if (= 0 (mod n i)) (return-from primep 'nil)))))))

(write-line (write-to-string (solve 600851475143)))
