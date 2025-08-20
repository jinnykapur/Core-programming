/*
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

*/

import java.util.*;

public class heightConvert{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your height: ");
		int height=sc.nextInt();
		double inches=height/2.54;
		double feet=inches/12;
		//int remInch=inches%12;
		System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
		
		//Output: Your Height in cm is 200 while in feet is 6.561679790026247 and inches is 78.74015748031496
	}
}
