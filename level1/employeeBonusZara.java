/*
Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/

import java.util.*;

public class employeeBonusZara{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        int years = sc.nextInt();
		
		if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus (less than or equal to 5 years of service).");
        }
	}
}