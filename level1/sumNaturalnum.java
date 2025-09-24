/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/
import java.util.*;
public class sumNaturalnum{
	public int calSum(int n){
		int ans=0;
		for(int i=0;i<=n;i++){
			ans=ans+i;
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int n=sc.nextInt();
		sumNaturalnum obj=new sumNaturalnum();
		int res=obj.calSum(n);
		System.out.println(res);
	}
}