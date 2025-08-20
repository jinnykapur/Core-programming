/*
Write a program that takes the base and height to find area of a triangle in square inches 
and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Area of triangle in square inches is ___ and in square centimeters is ____.
*/
import java.util.*;
public class aREAtriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double b=sc.nextFloat();
		double h=sc.nextFloat();
		double area=0.5*b*h;
		double areaInches=area/(2.54*2.54);
		System.out.println("Area of triangle in square inches is "+areaInches+" and in square centimeters is "+area);
		//output:Area of triangle in square inches is 1.62750325500651 and in square centimeters is 10.5

	}
}

