/*
Create a program to store the digits of the number in an array and find the largest and second largest element of 
the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and 
the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to 
modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to 
consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more 
elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits 
into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and 
second largest number
*/
import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

      
        while (number != 0) {
            int digit = number % 10; 
            number = number / 10;    

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; 
            }

            digits[index] = digit;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
/*
Enter a number: 843424232

Digits stored in array:
2 3 2 4 2 4 3 4 8
Largest digit: 8
Second largest digit: 4
*/
