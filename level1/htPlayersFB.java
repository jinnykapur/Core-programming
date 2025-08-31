/*
Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/
import java.util.*;

public class htPlayersFB{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		double[] heights=new double[11];
		System.out.println("Enter the heights of the football players:");
		for(int i=0;i<11;i++){
			heights[i]=sc.nextDouble();
		}
		double sum=0.0;
		for(int i=0;i<11;i++){
			sum=sum+heights[i];
		}
		double mean=sum/11;
		System.out.printf("Mean height of the football team is %.2f.%n", mean);
	}
}
/*
Enter the heights of the football players:
170.7
169.5
180.1
174.2
182.7
176.09
189.45
165
173.98
186.12
190
Mean height of the football team is 177.99.

*/