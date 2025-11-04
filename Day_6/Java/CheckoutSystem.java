import java.util.Scanner;
import java.util.ArrayList;


public class CheckoutSystem{

	ArrayList<String> itemsList = new ArrayList<>();
	ArrayList<Integer> pricelist = new ArrayList<>();

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		CheckoutSystemFunctions function = new CheckoutSystemFunctions();
		

        while (true){
		System.out.print("Enter product name or type 'done' to finish: ");
		String item = input.nextLine();
		if( item.equals("done") )
			break;

		function.addToItemsList(item);
		
		System.out.printf("Enter price for %s: ", item);
		String rawOption = input.nextLine();
		
		function.addToPriceList(rawOption);
		
	}
		
	}
}