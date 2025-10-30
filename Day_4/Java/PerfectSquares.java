import java.util.ArrayList;

public class PerfectSquares{

		public String VerifyDataType(int[] numbers){
		int count = 0;
		for( int index = 0; index < numbers.length; index++ ){
			int number = numbers[index];
		
			if (number / number == 1){
				for( int range = 1; range < number; range++){
					int square = range * range;
					if (square == number)
						count++;
						System.out.print(count);
						}}}	
				if (count == numbers.length)
					return("True");
				else
					return("False");
				
//				return("All items in the array need to be integers");
	}
}	

	

