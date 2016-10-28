package StockMarket;

/**
 * This class find the maximum profit that could be made from 
 * the stock prices that vary throughout the day.
 * Profit is calculated on the basis of stock bought first and sold.
 * 
 *
 * @version   $Id$ 1.0 StockProfit.java
 *
 * @author   Niyati Shah
 *
 * Revisions:
 *	$Log$
 */

public class StockProfit {
	
	
	public static void main(String args[]){
		StockProfit profit = new StockProfit();
		profit.start();
	}

	

    /**
     * @description : Start program to calculate
     *                 	profit
     */
	public void start(){
		
		// Three examples to calculate profit
		int[] dayOne = {10, 7, 6, 5, 11, 8};		// Varying stock price
		int[] dayTwo = {10,9,8,7,6,5,4,3,2,1};		// Decreasing stock price
		int[] dayThree = {11,11,6,5,4,3,2,1};		// 
		
		// Calcualte the profit earned
		 CalculateProfit(dayOne);
		 CalculateProfit(dayTwo);
		 CalculateProfit(dayThree);
		 
		
	}
	

    /**
     * @description : Calculate the days
     *                 	profit
     *                 
     *  @param : array of prices for the day
     *  
     */
	 public void CalculateProfit(int[] price){
		 
		 // check if there are atleast 2 values to calculate profit
		 if(price.length < 2){
			 System.out.println("Profit cannot be calculated");
			 
		 }else{
			 int profit, Tempprice;
			 int minPrice = price[0];
			 int maxProfit = price[1]-price[0];
			 for (int currPrice =1; currPrice<price.length; currPrice++){

				 // calculate profit for the current price and minimum 
				 profit  = price[currPrice] - minPrice;
				 
				 // Check what is the minimum price at which you can buy
				 minPrice = Math.min(minPrice, price[currPrice]);
			
				 
				 // Calculate if the current profit as more than maximum profit that has been got yet.
				 maxProfit = Math.max(maxProfit, profit);	
				 
			 }
			 
			 // Check if there was a profit or loss
			 if(maxProfit< 0){
				 System.out.println("There was no profit, your min loss was " + maxProfit);
			 } else if(maxProfit== 0){
				 System.out.println("There was no profit no loss so total earned is " + maxProfit);
			 } else if(maxProfit> 0){
				 System.out.println("Your total Profit was " + maxProfit);
			 }
 
		 }
	 }
}
