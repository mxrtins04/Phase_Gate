import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade{
public static void main(String [] args){

	StudentGradeFunctions function = new StudentGradeFunctions();
	int lengthOfScores = 0;
	ArrayList<String> names = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	int[][] studentsRecord;
	String studentName = "";
	
	while(true){
		System.out.print("How many students do you have? ");
		String students = input.next();
		Integer numberOfStudents = function.validateScore(students);
		if( numberOfStudents == null )
			continue;
		
		System.out.print("How many courses do they offer? ");
		String courses = input.next();
		input.nextLine();
		Integer numberOfCourses = function.validateScore(courses);
		if( numberOfCourses == null ){
			System.out.println("Please put in a number!!!");
			continue;}

		studentsRecord = new int[numberOfStudents][numberOfCourses];
		
		int lengthOfRecord = studentsRecord.length;
		lengthOfScores = studentsRecord[0].length;
			for( int counter = 0; counter < lengthOfRecord; counter++ ){
			
			while(true){
			System.out.println("Input students name: ");
			String rawName = input.nextLine();

			studentName = function.validateString(rawName);
			
			if (studentName == null){
				System.out.println("Please input THE NAME of the student");
				continue;}
			else{
				System.out.printf("%s added to the database%n", studentName);
				function.addStudent(counter, studentsRecord);
				function.addName(studentName, names);
				System.out.printf("Input %s's score for each course: %n", studentName);
				break;}}
			
			

			
			for( int counter2 = 1; counter2 <= lengthOfScores; counter2++ ){
				String rawScore = input.nextLine();
				int index = counter2 - 1;
				Integer studentScore = function.validateScore(rawScore);
				while(true){
				if (studentScore == null){
					System.out.println("Please input THE SCORE of the student");
					continue;}
				else{
					function.addScores(counter, index, studentScore, studentsRecord);
					System.out.println("Score recorded. Input score for other courses: ");
					break;}}
				
			}
				System.out.printf("All scores for %s have been recorded.%n", studentName);
			



			
			
			}
		
		break;
	
		}		
		System.out.print("STUDENT	");
		for( int sub = 0; sub < lengthOfScores; sub++ ){
			
			System.out.printf("SUB %d	", sub + 1);
			System.out.println();
			System.out.printf("STUDENT%d	", sub + 1);

			if( sub < lengthOfScores )
				continue;
			for(int j = 0; j < studentsRecord[sub].length; j++){
				System.out.printf(" %d	", studentsRecord[sub][j]);
}}
		


}
}


/*			String rawScore = input.nextLine();
			
			String studentScore = function.validateScore(rawScore);
			
			if (studentScore == null){
				System.out.println("Please input THE SCORE of the student");
				continue;}
			else{
				function.addScores(counter, studentScore, names);
				break;}*/