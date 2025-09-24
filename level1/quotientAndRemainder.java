/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.*;
public class quotientAndRemainder{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int quotient=number/divisor;
		int remainder=number%divisor;
		return new int[]{quotient,remainder};
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter divisor: ");
        int div = sc.nextInt();

        int[] result = findRemainderAndQuotient(num,div);
        System.out.println("Quotient " + result[0]);
        System.out.println("Remainder: " + result[1]);
	}
	
}