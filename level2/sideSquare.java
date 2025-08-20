/*
Write a program to find the side of the square whose parameter you read from the user 
Hint => Perimeter of the Square is 4 times the side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/
import java.util.*;

public class sideSquare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		int s = sc.nextInt();
		int perimeter=s*4;
		System.out.println("The length of the side is "+s+" cm whose perimeter is "+perimeter+" cm.");
	}
}