import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class DepreciationFunctionTest{
	int price = 50000;
	double depreciationValue = 0.08;
	@Test
	public void testThatDepreciationReturnsTheCorrectAmountOfTimeTakenForAnItemToBeFree(){
		Depreciation depreciation = new Depreciation();
		double result = depreciation.getTimeTillItemIsFree(price, depreciationValue, 1);
		
		assertEquals( result, 12.5);

	}

/*	@Test
	public void testThatUserInputsJust */
}