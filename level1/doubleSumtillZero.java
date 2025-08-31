/*
Write a program to store multiple values in an array up to a maximum of 10 or until the user 
enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store 
the total of type double initializes to 0.0. 
Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign 
the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/
import java.util.*;

public class doubleSumtillZero{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		double[] nums=new double[10];
		double total=0.0;
		int idx=0;
		
		while(true){
			System.out.print("Enter a number(0 or -ve to stp): ");
			double n=sc.nextDouble();
			if(n<=0 || idx==10){
				break;
			}
			nums[idx]=n;
			idx++;
		}
		for(int i=0;i<idx;i++){
			total+=nums[i];
		}
		System.out.println("\nYou entered:");
        for (int i = 0; i < idx; i++) {
            System.out.print(nums[i] + " ");
        }
		System.out.println("\nSum of numbers: " + total);
	}
}
/*
OUTPUT:

Enter a number(0 or -ve to stp): 1
Enter a number(0 or -ve to stp): 12
Enter a number(0 or -ve to stp): 9
Enter a number(0 or -ve to stp): -1

You entered:
1.0 12.0 9.0
Sum of numbers: 22.0

------------------------------------------

Enter a number(0 or -ve to stp): 100
Enter a number(0 or -ve to stp): 12
Enter a number(0 or -ve to stp): 4
Enter a number(0 or -ve to stp): 0

You entered:
100.0 12.0 4.0
Sum of numbers: 116.0

*/