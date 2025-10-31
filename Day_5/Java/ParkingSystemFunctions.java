import java.util.ArrayList;
import java.util.Arrays;

public class ParkingSystemFunctions{

	public ArrayList<Integer> displayAvailableSpots( int[] parkingSpace ){
		

		ArrayList<Integer> availableSpace = new ArrayList<>();
		for( int index = 0; index < parkingSpace.length; index++ ){
		if( parkingSpace[index] == 0 )
			availableSpace.add(index + 1);
			}
	
		return availableSpace;

		}

	public String errorMessage(){
		return("Please put in a number");}

	

	public ArrayList<Integer> getASpot( ArrayList<Integer> availableSpace, Object userInput1 ){
		
		if(( userInput1 instanceof String )){
			ArrayList<Integer> error1 = new ArrayList<>(Arrays.asList(-1));
			return error1;}
		int exists = 0;
		int userInput = ((Integer) userInput1).intValue();

		if( userInput < 1 || userInput > 20 ){
			ArrayList<Integer> error1 = new ArrayList<>(Arrays.asList(-3));
			return error1;}

	
	
		for(int spot: availableSpace ){
		
		if( userInput == spot ){
			availableSpace.remove(spot);
			exists++;
		if( exists == 1)
		return availableSpace;
		}
			
		}
		ArrayList<Integer> error2 = new ArrayList<>(Arrays.asList(-2));
		return error2;
	}



	public ArrayList<Integer> leaveSpot( ArrayList<Integer> availableSpace, Object userInput1 ){
		if(!( userInput1 instanceof Integer )){
			availableSpace = new ArrayList<>(Arrays.asList(-1));
			return availableSpace;}

		int userInput = ((Integer) userInput1).intValue();
	
		if( userInput < 1 || userInput > 20 ){
			ArrayList<Integer> error2 = new ArrayList<>(Arrays.asList(-3));
			return error2;}


		availableSpace.add(userInput);
	
		return availableSpace;

	
	}

	

	

}