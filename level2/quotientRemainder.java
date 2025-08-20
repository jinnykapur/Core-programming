/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

*/
import java.util.*;

public class quotientRemainder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number2: ");
		int n2 = sc.nextInt();		
		int quotient=n1/n2;
		int remainder=n1%n2;
		System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two numbers "+n1+" and "+n2+".");
		//output: The Quotient is 2 and Remainder is 0 of two numbers 4 and 2.
	}
}