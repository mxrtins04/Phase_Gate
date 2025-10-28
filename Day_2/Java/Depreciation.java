public class Depreciation{
	public double getTimeTillItemIsFree(int price, double depreciationValue, double numberOfItems){
	price = 50000;
	depreciationValue = 0.08;
	double reducedAmountPerYear = price * depreciationValue;
	double time = (price / reducedAmountPerYear) * numberOfItems;
	return(time);


}


}