/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/
import java.util.*;
public class SLnums{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		//method - 1 (best in terms of complexity)
		int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
		return new int[]{smallest,largest};
		
		/*
		//method-2 (is good for if numbers are more than 3)
		int[] arr = {number1, number2, number3};
        Arrays.sort(arr);  // sorts in ascending order
        return new int[]{arr[0], arr[2]}; // first = smallest, last = largest
		//-------------------------------------------------------------------//
		//method-3 (also fine and simple)
		 int smallest = number1;
        int largest = number1;

        // Compare to find smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Compare to find largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
		*/
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
	}
	
}