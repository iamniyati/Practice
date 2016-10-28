package Product;

import StockMarket.StockProfit;

/**
 * This class find the product of every integer
 *  except the integer at that index.
 *
 * @version   $Id$ 1.0 StockProfit.java
 *
 * @author   Niyati Shah
 *
 * Revisions:
 *	$Log$
 */
public class ProductOfList {
	
	public static void main(String args[]){
		ProductOfList product = new ProductOfList();
		product.start();
	}

	

    /**
     * @description : Start program to calculate
     *                 	product
     */
	public void start(){
		
		
		int[] ListOne = {1,2,3,4,5,6,7};		
		int[] ListTwo = {3,1,2,5,6,4};		
		int[] ListThree = {11,11,6,5,4,3,2,1};		 
		
		// Calculate the product
		 CalculateProduct(ListOne);
		 CalculateProduct(ListTwo);
		 CalculateProduct(ListThree);		 
		
	}

    /**
     * @description : Calculate the product of numbers
     *                 	in the list except at the current index
     *                 
     *  @param : list of integers
     *  
     */
	public void CalculateProduct(int[] list){
		// If list has 0 or 1 integer than we cannoy compute the product
		if(list.length < 2){
			System.out.println(" No product can be formed");
		}else{
			int[] productExecptIndex = new int[list.length];
			int product = 1;
			
			// Find product of all numbers before the index number
			for(int i = 0; i<list.length;i++){
				productExecptIndex[i] = product;
				product *= list[i];
		
			}
			// Find product of all numbers after the index number
			// and total product
			product = 1;
			for (int i = list.length-1; i>=0; i--){
				productExecptIndex[i] *= product;
				product *= list[i];
				
				
			}
			PrintList(productExecptIndex);
		}		
	}
	
    /**
     * @description : Function to print
     *                 	the list.
     */
	public void PrintList(int[] list){
		System.out.println("\n");
		for(int i =0; i<list.length;i++){
			System.out.print(list[i]+" ");
		}
	}
}
