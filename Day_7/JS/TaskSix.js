let number = 1;

while( number <= 10 ){
	
	if(number % 4 == 0){
		let constant_number = number
		let count = 0;
		while (count < 5){
			console.log(number);
			number *= constant_number;
			count++;
			
		}
		number = constant_number;
	}
	number++;

}	
	
	