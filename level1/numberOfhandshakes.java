/*
Create a program to find the maximum number of 
handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to 
calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to 
calculate the number of handshakes
*/

import java.util.*;

public class numberOfhandshakes{
	public int handshakes(int n){
		return (n * (n - 1)) / 2;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n=sc.nextInt();
		numberOfhandshakes obj=new numberOfhandshakes();
		int combinations=obj.handshakes(n);
		System.out.println("Total number of hanshakes of "+n+" students is "+combinations+".");
	}
}


