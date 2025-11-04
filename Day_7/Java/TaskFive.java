public class TaskFive{
	public static void main(String [] args){
		int parenthesis = 0;
		for(int number = 1; number <= 10; number++){
			if( number % 4 == 0 ){
				if (parenthesis < 1){
					parenthesis ++;
					System.out.print("(");}
			for(int count = 1; count <= 5; count++){
				System.out.printf("%d", number);}
			System.out.print(" ");		
			parenthesis++;
			if (parenthesis == 3 )
			System.out.print(")");}
		}	


	}

}