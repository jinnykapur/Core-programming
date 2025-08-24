/*
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____

*/

import java.util.*;

public class smallestOf3num{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("number1: ");
		int n1=sc.nextInt();
		System.out.print("number2: ");
		int n2=sc.nextInt();
		System.out.print("number3: ");
		int n3=sc.nextInt();
		boolean smallest=false;
		if(n1<n2 && n1<n3){
			smallest=true;
		}
		System.out.println("Is the first number the smallest? "+smallest);
	}
}
/*
Output:
number1: 12
number2: 11
number3: 13
Is the first number the smallest? false
*/