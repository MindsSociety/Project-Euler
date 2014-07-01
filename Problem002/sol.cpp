#include <iostream>

using namespace std;

int main() {
	int i = 0, j = 1;
	int current = 0;
	int result = 0;
	
	while(current < 4000000) {
		current = i + j;
		
		if (current % 2 == 0) {
			result += current;
		}
		
		i = j;
		j = current;
	}
	
	cout << result << endl;
	return 0;
}
