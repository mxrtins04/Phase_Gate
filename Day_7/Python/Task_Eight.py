sum_first_pair = 0;
sum_second_pair = 0;
pair = 0


for number in range(1, 10):
	if( number % 4 == 0 ):
		pair += 1
		constant_number = number
		count = 1
		while(count <= 5):
			if( pair == 1 ):
				sum_first_pair += number;
			elif( pair == 2 ):
				sum_second_pair += number;

			number *= constant_number
			count += 1

sum = sum_first_pair + sum_second_pair

print(f"({sum})")
