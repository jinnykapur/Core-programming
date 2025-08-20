/*
Suppose you have to divide 14 pens among 3 students equally. 
Write a program to find how many pens each student will get if the pens must be divided equally. 
Also, find the remaining non-distributed pens.
Hint => 
a) Use Modulus Operator (%) to find the reminder.
b) Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___
*/

import java.util.*;

public class q5_dividePens{
	public static void main(String args[]){
		int tpen=14; //total pen
		int ns=3;    //no. of students
		int ndp=tpen%ns; //non-distributed pen
		int p2es=tpen/ns; //pen to each student
		System.out.println("The Pen Per Student is "+p2es+" and the remaining pen not distributed is "+ndp+".");
		 
		//Output: The Pen Per Student is 4 and the remaining pen not distributed is 2.

	}
}

