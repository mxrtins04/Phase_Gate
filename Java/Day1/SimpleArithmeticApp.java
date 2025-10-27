import java.util.Scanner;

public class SimpleArithmeticApp{
	public static void main(String[] args){
	System.out.print("hi");
	int score = 0;
	Scanner input = new Scanner(System.in);

	for( int level = 1; level <= 3; level++){
	int first_number = (int)(Math.random()*1000);
	int second_number = (int)(Math.random()*10);

	
	if( second_number > first_number){
		int temp = first_number;
		int temp_2 = second_number;

		second_number = temp;
		first_number = temp_2;
			}
	
	int correct_answer = first_number - second_number;

	System.out.printf("What is %d - %s? ", first_number, second_number);
	int answer = input.nextInt();
	if (correct_answer == answer)
		score++;
			
		else{
			System.out.print("Wrong answer... You have 1 trial left for this question... Try again: ");
			answer = input.nextInt();}

			if (correct_answer == answer){
				System.out.println("Correct!");
				score++;}
			else{
				System.out.println("Wrong answer");
				System.out.print("Would you like to continue?(y/n) ");}

		
}
System.out.printf("You scored %d / 10", score);}}
