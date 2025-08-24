/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/
import java.util.*;

public class DivisibleBy5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean divisible=false;
		if(n%5==0){
			divisible=true;
		}
		System.out.println("Is the number "+n+" divisible by 5? "+divisible);
	}
}