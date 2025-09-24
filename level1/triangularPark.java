/*
An athlete runs in a triangular park with sides provided as input by the user in meters. 
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
import java.util.*;

public class triangularPark{
	public int rounds(int dist,int perimeter){
		return perimeter/dist;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Sides of triangular park: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int perimeter=a+b+c;
		System.out.print("Distance athelete wants to run: ");
		int dist=sc.nextInt();
		
		triangularPark obj=new triangularPark();
		int round=obj.rounds(dist, perimeter);
		
		System.out.println("Number of rounds: "+round);
		
		
	}
}
/*
Sides of triangular park:
3
4
5
Distance athelete wants to run: 2
Number of rounds: 6
*/