import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingSystem{
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	ParkingSystemFunctions function = new ParkingSystemFunctions();
	int[] parkingSpace = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	ArrayList<Integer> availableSpace = new ArrayList<>();

	String menu = """ 
			Would you like to:
		1. Reserve a spot.
		2. Leave.
			""";


	while (true){
		
		System.out.print(menu);
		int option1 = input.nextInt();
		Object option = option1;

		
		switch((Integer) option){
			case 1 -> {
				availableSpace = function.displayAvailableSpots(parkingSpace);
				System.out.println("Hi user, these are the available spots.");
				for( int spot : availableSpace ){
					System.out.printf("%d%n", spot);}

				while (true){
					System.out.println("Please pick one: ");
					int userInput = input.nextInt();
					ArrayList<Integer> getSpot = function.getASpot( availableSpace, option );
					System.out.print(getSpot);
		
					if (getSpot.get(0) == -1)
					System.out.print("Please put in a number");}
	
			
  		}
	}
}}}