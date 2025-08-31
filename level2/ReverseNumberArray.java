/*
Create a program to take a number as input and reverse the number. To do this, store the digits of the number 
in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/
import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }
        System.out.println("\nDigits of the number:");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\nReversed number digits:");
        for (int d : reverse) {
            System.out.print(d + " ");
        }
        System.out.print("\nReversed number: ");
        for (int d : reverse) {
            System.out.print(d);
        }

    }
}
