import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;


public class ParkingSystemFunctionsTest{
	int[] parkingSpace = {0, 0, 0, 0, 0};
	ArrayList<Integer> availableSpot = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	ParkingSystemFunctions function;

	@BeforeEach
	void setup(){
		function = new ParkingSystemFunctions();
		}
	
	@Test
	public void testThatDisplayAvailableSpotsShowsAllSpotsAreEmpty(){
		

		ArrayList<Integer> actual = function.displayAvailableSpots(parkingSpace);
		ArrayList<Integer> expected =  new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		assertEquals(actual, expected);
		}
	
	@Test
	public void testThatBookSpotCanBookASpot(){
		ArrayList<Integer> actual = function.GetASpot(availableSpot, 3);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
		
		assertEquals(actual, expected);
		
		
	}

	@Test
	public void testThatBookASpotCantBookAnAlreadyBookedSpot(){
		ArrayList<Integer> actual = function.GetASpot(availableSpot, 6);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-2));
		
		assertEquals(actual, expected);
	}

	@Test
	public void testThatBookSpotCollectsOnlyNumbers(){
		ArrayList<Integer> actual = function.GetASpot(availableSpot, "b");
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1));
		
		assertEquals(actual, expected);


	}

	
	@Test
	public void testThatLeaveSpotAddsTheFreeSpotToListOfFreeSpots(){
		ArrayList<Integer> actual = function.leaveSpot(availableSpot, 6);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		assertEquals(actual, expected);
	}


	@Test
	public void testThatLeaveSpotCollectsOnlyNumbers(){
		ArrayList<Integer> actual = function.GetASpot(availableSpot, "b");
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1));
		
		assertEquals(actual, expected);

	}

	@Test
	public void testThatGetASpotIsWithinTheRangeOfOneAndTwenty(){
		ArrayList<Integer> actual = function.GetASpot(availableSpot, -2);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-3));
		assertEquals(actual, expected);

		ArrayList<Integer> actual2 = function.GetASpot(availableSpot, 22);
		ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(-3));
		assertEquals(actual2, expected2);


	}

	@Test
	public void testThatLeaveSpotIsWithinTheRangeOfOneAndTwenty(){
		ArrayList<Integer> actual = function.leaveSpot(availableSpot, -2);
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-3));
		assertEquals(actual, expected);

		ArrayList<Integer> actual2 = function.leaveSpot(availableSpot, 22);
		ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(-3));
		assertEquals(actual2, expected2);
	}


}

