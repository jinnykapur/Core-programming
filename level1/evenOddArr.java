/*
Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. 
Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. 
If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, 
save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/

import java.util.*;

public class evenOddArr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int num=sc.nextInt();
		int n=num/2+1;
		int[] even=new int[n];
		int[] odd=new int[n];
		int oi=0, ei=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				even[ei]=i;
				ei++;
			}
			else{
				odd[oi]=i;
				oi++;
			}
		}
		
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oi; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < ei; i++) {
            System.out.print(even[i] + " ");
        }
	}
}
