for number in range(1, 10):
	if( number % 4 == 0 ):
		constant_number = number
		count = 1
		while(count <= 5):
			print(f"{number}" )
			number *= constant_number
			count += 1
