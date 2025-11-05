import java.util.ArrayList;
import java.util.Arrays;

public class StudentGradeFunctions{

	public Integer validateScore(String score){
		try{
			return Integer.parseInt(score);
		}
		catch (NumberFormatException e) {
			System.out.println("Please put in a number");
			return null;}	
	}


	public ArrayList<String> addName(String name, ArrayList<String>names){
		names.add(name);
		return names;
	}

	public int [][] addStudent(int count, int [][] studentRecords){
		studentRecords[count][0] = count;
		return studentRecords;
	}

	public int [][] addScores(int count, int count2, int score, int [][] studentRecords){
		studentRecords[count][count2] = score;
		return studentRecords;
	}

	public String validateString(String name){
		for(char c : name.toCharArray()){
			if(!Character.isLetter(c))
			return(null);}
		return name;
	}
		
}