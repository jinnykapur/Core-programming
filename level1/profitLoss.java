/*
Create a program to calculate the profit and loss in number and percentage based on 
the cost price of INR 129 and the selling price of INR 191. 

Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => The Cost Price is INR ___ and Selling Price is INR ___
	   The Profit is INR ___ and the Profit Percentage is ___


*/
import java.util.*;

public class q4_profitLoss{
	public static void main(String args[]){
		int cp=129;
		int sp=191;
		int profit=sp-cp;
		int pPerCent=(profit*100)/cp;
		System.out.println("The Cost Price is INR "+cp+ " and Selling Price is INR "+sp+".");
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+pPerCent+" %.");
		//Output: The distance 10.8 km in miles is 17.28 miles.
	}
}
