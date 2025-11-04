public class TaskSeven{
	public static void main(String [] args){
		int parenthesis = 0;
		int constantNumber = 0;
		int sumFirstPair = 0;
		int sumSecondPair = 0;
		int pair = 0;
		for(int number = 1; number <= 10; number++){
			if( number % 4 == 0 ){
				pair++;
				constantNumber = number;
				if (parenthesis < 1){
					parenthesis ++;
				}
			for(int count = 1; count <= 5; count++){
				if( pair == 1 )
					sumFirstPair += number;
				else if( pair == 2 )
					sumSecondPair += number;

				number *= constantNumber;}
			number = constantNumber;	
			parenthesis++;
			
			}

		
		}	
		System.out.printf("(%d %d)", sumFirstPair, sumSecondPair);

	}

}