use strict;
use warnings;
use feature qw/say/;

my $number = 600851475143;
my $candidate = 2;
my $rest = $number;

while($candidate <= sqrt($rest)) {
    unless($rest % $candidate) {
        $rest /= $candidate;
    } else {
        $candidate += ($candidate == 2 ? 1 : 2);
    }
}

say $rest;
