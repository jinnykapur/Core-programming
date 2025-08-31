/*
Working with Multi-Dimensional Arrays. 
Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. 
For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. 
Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, 
and the inner for loops to access each element
*/

import java.util.*;

public class TWOdArrayPrint{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
		int[] array = new int[rows * cols];
		int index = 0; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
		System.out.println("\n1D Array after copying elements:");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }

	}
}
/*
Enter number of rows: 3
Enter number of columns: 2
Enter elements of the matrix:
Element at [0][0]: 1
Element at [0][1]: 2
Element at [1][0]: 3
Element at [1][1]: 4
Element at [2][0]: 5
Element at [2][1]: 6

1D Array after copying elements:
1 2 3 4 5 6
*/