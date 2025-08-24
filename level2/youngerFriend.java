/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based 
on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/

import java.util.*;

public class youngerFriend{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		// to find the youngest
		System.out.print("Amar's age : ");
		int amAge=sc.nextInt();
		System.out.print("Akhbar's age : ");
		int akAge=sc.nextInt();
		System.out.print("Anthony's age : ");
		int anAge=sc.nextInt();
		int youngestAge;
        if (amAge <= akAge && amAge <= anAge) {
            youngestAge = amAge;
        } else if (akAge <= amAge && akAge <= anAge) {
            youngestAge = akAge;
        } else {
            youngestAge = anAge;
        }
		System.out.println("Youngest age: " + youngestAge);
		System.out.println("______________________________________________________________________________");
		
		// to find the tallest
		System.out.print("Amar's height : ");
		double amh=sc.nextDouble();
		System.out.print("Akhbar's height : ");
		double akh=sc.nextDouble();
		System.out.print("Anthony's height : ");
		double anh=sc.nextInt();
		double tallest;
		if (amh >= akh && amh >= anh) {
			tallest = amh;
		} else if (akh >= amh && akh >= anh) {
			tallest = akh;
		} else {
			tallest = anh;
		}

		System.out.println("Tallest Height: " + tallest);
		System.out.println("______________________________________________________________________________");
	}
}
