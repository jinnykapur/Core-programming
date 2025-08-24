/*
Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.

Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 

*/

import java.util.*;

public class factorialNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		
		//while loop
		int factorial=1;
		int i=1;
		while(i<=n){
			factorial=factorial*i;
			i++;
		}
		/*
		//for loop
		for (int i = 1; i <= n; i++) {
			factorial *= i; 
		}
		*/
		System.out.println("Factorial of " + n + " is: " + factorial);
		
	}
}