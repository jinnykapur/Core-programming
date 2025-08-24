/*
Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
Rewrite the above program 7 to find the factors of a number using the while loop
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
*/

import java.util.*;

public class factorOfNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		// for loop
		System.out.println("Factors of " + n + " are:");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
		
		/*
		// while loop
		System.out.println("Factors of " + n + " are:");
		int count = 1;
		while (counter < n {
			if (n% count== 0) {
				System.out.println(count);
			}
			count++;
		}
		*/
		
	}
}