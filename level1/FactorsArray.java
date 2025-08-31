/*
Create a program to find the factors of a number taken as user 
input, store the factors in an array, and display the factors
Hint => 
Take the input for a number
Find the factors of the number and save them in an array. 
For this create integer variable maxFactor and initialize to 10, 
factors array of size maxFactor and index variable to reflect 
the index of the array. 
To find factors loop through the numbers from 1 to the number, 
find the factors, and add them to the array element by 
incrementing the index. If the index is equal to maxIndex, 
then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, 
use the temp array to store the elements from the factors array, 
and eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/

import java.util.*;

public class FactorsArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int maxFactor = 10; // initial size
        int[] factors = new int[maxFactor];
        int index = 0;
		 for (int i = 1; i <= num; i++) {
            if (num % i == 0) {  // check factor
                // Step 4: Resize if needed
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;  // double size
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // assign new array
                }
                factors[index] = i; // store factor
                index++;
            }
        }
		System.out.print("Factors of " + num + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
	}
}