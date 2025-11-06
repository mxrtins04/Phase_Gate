import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade{
public static void main(String [] args){

	StudentGradeFunctions function = new StudentGradeFunctions();
	int lengthOfScores = 0;
	int lengthOfRecord = 0;
	
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> scoresOfStudents = new ArrayList<>();
	ArrayList<Integer> position = new ArrayList<>();
	ArrayList<Integer> totalScoresOfStudents = new ArrayList<>();

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
		
		lengthOfRecord = studentsRecord.length;
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
				
				int index = counter2 - 1;
				Integer studentScore = null;
				while(studentScore == null){
					 System.out.print("Enter score for course " + counter2 + ": ");
					String rawScore = input.nextLine();
					studentScore = function.validateScore(rawScore);
				if (studentScore == null){
					System.out.println("Please input THE SCORE of the student");
					}
				else{
					function.addScores(counter, index, studentScore, studentsRecord);
					System.out.println("Score recorded. Input score for other courses: ");
					}}
				
			}
				System.out.printf("All scores for %s have been recorded.%n", studentName);
			}
		break;
		}		
		System.out.print("STUDENT	");
		for( int index = 0; index < lengthOfScores; index++ ){
			
			System.out.printf("\tSUB%d\t", index + 1);
		}
			System.out.print("\t\tTOTAL\tAVE\tPOS");
			

		 

		System.out.println();
		for( int index2 = 0; index2 < lengthOfRecord; index2++ ){
			function.getStudentTotal(index2, studentsRecord, 0, totalScoresOfStudents);
		}
		position = function.getPositionOfStudent( position, totalScoresOfStudents);

		for( int index2 = 0; index2 < lengthOfRecord; index2++) {
			int total = totalScoresOfStudents.get(index2);
			double average = function.calculateStudentAverage(index2, studentsRecord, total);
			int rank = position.get(index2);
			

			System.out.printf("%s\t",names.get(index2) );
			for( int score : studentsRecord[index2] ){
				System.out.printf("\t%d\t", score);}
		
		System.out.printf("\t\t%d\t%.2f\t%d%n", total, average, rank);

		
}

		System.out.println("\nSTUDENT SUMMARY");


		int highestTotal = totalScoresOfStudents.get(0);
		int lowestTotal = totalScoresOfStudents.get(0);
		String bestStudent = names.get(0);
		String worstStudent = names.get(0);
		int classTotal = 0;
		int highestScore = 0;
		int lowestScore = 0;
		String highestStudent = names.get(0);
		String lowestStudent = names.get(0);

		for (int count = 0; count < totalScoresOfStudents.size(); count++) {
			int total = totalScoresOfStudents.get(count);
			classTotal += total;

			if (total > highestTotal) {
			highestTotal = total;
			bestStudent = names.get(count);
			}

			if (total < lowestTotal) {
				lowestTotal = total;
				worstStudent = names.get(count);
			}
		}


		double classAverage = (double) classTotal / totalScoresOfStudents.size();
		System.out.println("===========================");
		System.out.printf("Best student: %s => Total: %d%n", bestStudent, highestTotal);
		System.out.printf("Worst student: %s => Total: %d%n", worstStudent, lowestTotal);
		
		System.out.println("===========================\n");

		System.out.println("\nCLASS SUMMARY");
		System.out.println("===========================");
		System.out.printf("Class total score: %d%n", classTotal);
		System.out.printf("Class average score: %.2f%n", classAverage);
		System.out.println("===========================\n");


		System.out.println("\nSUBJECT SUMMARY");
		
		for( int subject = 0; subject < lengthOfScores; subject++ ){
			
			System.out.printf("%nSubject%d SUMMARY%n", subject + 1);
			System.out.println("===========================");
		
			int firstIndex = 0;
			for( firstIndex = 0; firstIndex < lengthOfRecord; firstIndex++ ){
	
				int subjectScore = studentsRecord[firstIndex][subject];
				if (subjectScore > highestScore){
					highestScore = subjectScore;
					highestStudent = names.get(firstIndex);}

				if( subjectScore < lowestScore ){
					lowestScore = subjectScore;
					lowestStudent = names.get(firstIndex);}
			}
 
		System.out.printf("Highest scoring student is: %s scoring %d%n", highestStudent, highestScore);
		System.out.printf("%nLowest scoring student is: %s scoring %d", lowestStudent, lowestScore);
		}
	
}
}