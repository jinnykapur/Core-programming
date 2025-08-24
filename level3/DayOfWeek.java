/*
Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. 
Your program should take three command-line arguments: m (month), d (day), and y (year). 
For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 
2 for Tuesday, and so forth. Use the following formulas, 
for the Gregorian calendar (where / denotes integer division):
y0 = y – (14 – m) / 12

x = y0 + y0/4 – y0/100 + y0/400

m0 = m + 12 × ((14 – m) / 12) – 2

d0 = (d + x + (31 × m0) / 12) mod 7

d0 result: 0 = Sunday, 1 = Monday, 2 = Tuesday, …

*/

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1=Jan, 2=Feb, ... 12=Dec): ");
        int m = input.nextInt();

        System.out.print("Enter day: ");
        int d = input.nextInt();

        System.out.print("Enter year: ");
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println("Day of week (0=Sunday, 1=Monday, ... 6=Saturday): " + d0);

    }
}
