/*
Write a program SpringSeason that takes two int values month and day from the command line and
prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
*/

import java.util.*;

public class checkSpringOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter day :");
		int day=sc.nextInt();
		System.out.print("Enter month :");
		int month=sc.nextInt();
		
		boolean isSpring = false;

        if ((month == 3 && day >= 20 && day <= 31) || // March 20 - 31
            (month == 4 && day >= 1 && day <= 30) ||  // April full
            (month == 5 && day >= 1 && day <= 31) ||  // May full
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 - 20
            isSpring = true;
        }
		
		if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}
}
