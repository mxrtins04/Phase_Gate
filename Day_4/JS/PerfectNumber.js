function isPerfectSquare(numbers) {
	
	

let count = 0;
		for(let index = 0; index < numbers.length; index++ ){
			number = numbers[index];
		
			if (number / number == 1){
				for(let range = 1; range < number; range++){
					let square = range * range;
					if (square == number)
						count++;
						}}}	
				if (count == numbers.length)
					return("True");
				else
					return("False");
}
let number = [4, 25]
console.log(isPerfectSquare(number));

/*if (number < 0) 
		return false;
	let count = 0;
	while (check * check <= number) {
		if (check * check == number)
		return true;
		check++;
        }
	return false;
    }
let arr number = new [4,6,7,2,8,9]
console.log(isPerfectSquare(number))
    //let result = [];
    //for (let check = 0; check < number.length; check++) {
        //(isPerfectSquare[check]));
    //}
    //return result;
//}
*/