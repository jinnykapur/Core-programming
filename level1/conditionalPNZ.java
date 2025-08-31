/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
Further for positive numbers check if the number is even or odd. Finally compare the first and last elements 
of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length 
If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. 
Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/

import java.util.*;

public class conditionalPNZ{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[] num=new int[n];
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(num[i]>0){
				System.out.println(num[i]+" is a positive number.");
				if(num[i]%2==0){
					System.out.println(num[i]+" is an even number.");
				}
				else{
					System.out.println(num[i]+" is an odd number.");
				}
			}
			else if(num[i]==0){
				System.out.println("Number is Zero.");
			}
			else{
				System.out.println(num[i]+" is a negative number.");
			}
			
		}
	}
}