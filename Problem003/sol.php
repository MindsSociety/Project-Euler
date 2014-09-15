<?php
	$n = 563547;

	while ($n > 0) {
		if (bcmod(600851475143, $n) == 0) {
			$is = true;
			
			for ($i = ceil(sqrt($n)); $i > 1; $i--) {
				if (bcmod($n, $i) == 0) {
					$is = false;
					break;
				}
			}
			
			if ($is) {
				echo $n;
				break;
			}
		}
		
		$n--;
	}
?>
