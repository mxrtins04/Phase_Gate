import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;


public class CheckoutSystemFunctionsTest{

	ArrayList<String> itemsList = new ArrayList<>();
	ArrayList<Integer> pricelist = new ArrayList<>();

	CheckoutSystemFunctions function;

	@BeforeEach
	void setup() {
		function = new CheckoutSystemFunctions();
    }

	@Test
	public void testThatAddToPriceListAddsPriceToPriceList(){
		ArrayList<Integer> actual = function.addToPriceList("14");
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(14));
		assertEquals(actual, expected);
	}

	@Test
	public void testThatAddToPriceListDoesNotCollectNonNumbersAsInput(){
		ArrayList<Integer> actual = function.addToPriceList("b");
		String expected = "null";
	}
	
	@Test
	public void testThatAddToItemsAddsItemsToList(){
		function.addToItemsList("Grenade");
		ArrayList<String> actual = function.addToItemsList("Laptop");
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Grenade", "Laptop"));
		assertEquals(actual, expected);
	}

	@Test
	public void testThatAddToItemsToListCollectsOnlyStrings(){
		ArrayList<String> actual = function.addToItemsList("4");
		String expected = "null";
		assertEquals(actual, expected);
		
	}

}