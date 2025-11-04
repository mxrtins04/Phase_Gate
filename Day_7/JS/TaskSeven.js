let number = 1;
let sum_first_pair = 0;
let sum_second_pair = 0;
let pair = 0

while( number <= 10 ){
	
	if(number % 4 == 0){
		pair++
		let constant_number = number
		let count = 0;
		while (count < 5){
			if( pair == 1 )
				sum_first_pair += number;
			else if( pair == 2 )
				sum_second_pair += number;
			number *= constant_number;
			count++;
		}
		number = constant_number;
	}
	number++;
	

}	
console.log(sum_first_pair);
console.log(sum_second_pair);