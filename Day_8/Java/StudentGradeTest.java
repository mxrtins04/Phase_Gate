import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentGradeTest {

	ArrayList<String> names = new ArrayList<>();
	StudentGradeFunctions function;

	@BeforeEach
	void setup() {
		function = new StudentGradeFunctions();
    }

	@Test
	public void testThatValidateScoresTakesInOnlyNumbers(){
		assertNull( function.validateScore("l"));
	
		int actual = function.validateScore("3");
		int expected = 3;

		assertEquals(actual, expected);
	}

	@Test
	public void testThatAddNameCollectsOnlyStrings(){
		ArrayList<String> actual = function.addName("Martins", names);
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("Martins"));
		 assertEquals(expected, actual);

	
	}

	@Test
	public void testThatValidateStringCollectsOnlyStringsWithAlphabets(){
		assertNull( function.validateString("2"));	

	}

}