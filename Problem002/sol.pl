$result = 0;
$prevTerm = $currentTerm = 1;
$newTerm = $currentTerm + $prevTerm;

while ($newTerm < 4000000) {
  $newTerm = $currentTerm + $prevTerm;
  
  if (!($newTerm % 2)) {
    $result += $newTerm;
  }

  $prevTerm = $currentTerm;
  $currentTerm = $newTerm; 
}

print $result . "\n";
