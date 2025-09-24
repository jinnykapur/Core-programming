/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. 
Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.*;

public class PNZmethod{
	public int pnz(int n){
		int ans=0;
		if(n<0){
			ans=-1;
		}
		if(n>0){
			ans=1;
		}
		return ans;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		PNZmethod obj=new PNZmethod();
		int res=obj.pnz(n);
		System.out.println(res);
	}
}

/*
//Positive
Enter number: 12
1

//negative
Enter number: -10
-1

//Zero
Enter number: 0
0

*/