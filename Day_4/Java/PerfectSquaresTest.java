import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;

public class PerfectSquaresTest{
		int[] numbers = {4, 25};
	PerfectSquares function;

		@BeforeEach
		void setup (){

			function = new PerfectSquares();

	}

		@Test
		public void testThatVerifyDataTypeReturnsOnlyInt(){
			
			String actual = function.VerifyDataType( numbers);
			String expected = "True";
			assertEquals( actual, expected);
			}

		@Test
		public void testThatFunctionCanDetermineAPerfectSquare(){
			String actual = function.VerifyDataType( numbers);
			String expected = "True";
			assertEquals( actual, expected);
			}
		
		@Test
		public void testThatFunctionCanDetermineAPerfectSquareAmongstSeveralNumbers(){
			String actual = function.VerifyDataType( numbers);
			String expected = "True";
			assertEquals( actual, expected);
			}

		@Test
		public void testThatFunctionCanIndicateIfThereAreNonIntegersInTheList(){
			String actual = function.VerifyDataType( numbers);
			String expected = "True";
			assertEquals( actual, expected);}
}

		