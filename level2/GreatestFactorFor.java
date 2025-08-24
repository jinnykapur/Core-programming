/*
Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/

import java.util.*;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
		int gf = 1;
		
		//for loop
		for (int i = n - 1; i >= 1; i--) {
			if (n % i == 0) {
				gf = i;
				break; 
			}
		}
		System.out.println("Greatest factor besides itself: " + gf);
        
		/*
		//while loop
		
		int gf = 1;
		int count = n - 1;

		while (count>= 1) {
			if (n % count == 0) {
				gf = count;
				break; // first factor found is the greatest
			}
			count--;
		}

		System.out.println("Greatest factor besides itself: " + gf);
		*/
    }
}
