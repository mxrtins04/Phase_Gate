public class TaskSix{
	public static void main(String [] args){
		int parenthesis = 0;
		int constantNumber = 0;
		for(int number = 1; number <= 10; number++){
			if( number % 4 == 0 ){
				constantNumber = number;
				if (parenthesis < 1){
					parenthesis ++;
					System.out.print("(");}
			for(int count = 1; count <= 5; count++){
				System.out.printf("%d ", number);
				number *= constantNumber;}
			number = constantNumber;
			System.out.print(" ");		
			parenthesis++;
			if (parenthesis == 3 )
			System.out.print(")");}

		
		}	
		

	}

}