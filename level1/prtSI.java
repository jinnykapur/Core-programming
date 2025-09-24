/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/

import java.util.*;

public class prtSI{
	public int simpleInterest(int p, int r,int t){
		return (p*r*t)/100;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("p: ");
		int p=sc.nextInt();
		System.out.print("r: ");
		int r=sc.nextInt();
		System.out.print("t: ");
		int t=sc.nextInt();
		prtSI obj=new prtSI();
		int SI=obj.simpleInterest(p,r,t);
		System.out.println("The Simple Interest is "+SI+" for Principal "+p+" Rate of Interest "+r+" and Time "+t+".");
	}
}