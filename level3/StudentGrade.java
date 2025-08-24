/*
Write a program to input marks and 3 subjects physics, chemistry and maths. 
Compute the percentage and then calculate the grade as per the following guidelines 

|   Percentage Range   |   Grade   |   Remarks   |
| -------------------- | --------- | ----------- |
| 90 – 100             | A         | Excellent   |
| 75 – 89              | B         | Good        |
| 50 – 74              | C         | Average     |
| Below 50             | F         | Fail        |

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

*/
import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Good)");
        } else if (average >= 50) {
            System.out.println("Grade: C (Average)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

    }
}

