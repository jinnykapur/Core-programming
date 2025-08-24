/*
Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. 
Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
*/

import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   
        double number;      

        System.out.print("Enter a number: ");
        number = sc.nextDouble();

    
        while (number != 0) {
            total += number; 
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }
		
		/*
		//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
		//Hint => 
		//Use infinite while loop as in while (true)
		//Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

		while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }
		*/

        System.out.println("total: " + total);
    }
	/*output:
	Enter a number: 12
	Enter a number: 9
	Enter a number: 0
	total: 21.0
	*/
	
	

}
