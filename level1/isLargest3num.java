/*
Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

import java.util.*;

public class isLargest3num{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("number1: ");
		int n1=sc.nextInt();
		System.out.print("number2: ");
		int n2=sc.nextInt();
		System.out.print("number3: ");
		int n3=sc.nextInt();
		boolean firstLargest = (n1 > n2 && n1 > n3);
        boolean secondLargest = (n2 > n1 && n2 > n3);
        boolean thirdLargest = (n3 > n1 && n3 > n2);
		
		System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
		
	}
}
/*
number1: 9
number2: 12
number3: 100
Is the first number the largest? false
Is the second number the largest? false
Is the third number the largest? true
*/
