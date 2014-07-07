<?php
	function sum_even_fibonacci($x = 100) {
		$f = array(1, 1);
            	
		while($f[count($f) - 1] < $x) {
			$f[] = $f[count($f) - 1] + $f[count($f) - 2];
		}
            	
		foreach ($f as $t) {
			if ($t % 2 == 0) {
				$e[] = $t;
			}
		}
            	
		return array_sum($e);
	}
            
	echo sum_even_fibonacci(4000000);
?>
