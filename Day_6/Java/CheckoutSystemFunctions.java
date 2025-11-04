import java.util.ArrayList;

public class CheckoutSystemFunctions{
	ArrayList<String> itemsList = new ArrayList<>();
	ArrayList<Integer> priceList = new ArrayList<>();

	public ArrayList<String> addToItemsList(String item){
		/*if( item instanceof String ){
			System.out.print("Invalid input! Put in the name of the item");
			return null;}*/
		
		itemsList.add(item);
		return itemsList;
		
	}

	public ArrayList<Integer> addToPriceList(String input){
		try {
			int price = Integer.parseInt(input);
			priceList.add(price);
			return priceList;
        }	catch (NumberFormatException e) {
			System.out.println("Please put in a number");
			return null;
        }


	}


	public int calculateSubtotal(ArrayList <Integer> priceList){
		int subtotal = 0;
		for( int index = 0; index < priceList.size(); index++){
			subtotal = priceList.get(index) + subtotal;
		}
	
		return subtotal;
	}

	public double getVAT(int subtotal){
		double VAT = subtotal * 0.075;
		return VAT;
	}


}