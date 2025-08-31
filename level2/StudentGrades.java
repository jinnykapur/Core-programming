/*
Program to take marks of students in Physics, Chemistry, and Maths
Compute percentage and grade using a 2D array

---------------------------------------------------------------------------
| Grade |         Remarks                               | Marks Range     |
---------------------------------------------------------------------------
|   A   | Level 4, above agency-normalized standards    | 80% and above   |
|   B   | Level 3, at agency-normalized standards       | 70% - 79%       |
|   C   | Level 2, below but approaching standards      | 60% - 69%       |
|   D   | Level 1, well below standards                 | 50% - 59%       |
|   E   | Level 1-, too below standards                 | 40% - 49%       |
|   R   | Remedial standards                            | 39% and below   |
---------------------------------------------------------------------------
*/

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];  // Physics, Chemistry, Maths
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;

                do {
                    System.out.print(subject + ": ");
                    mark = sc.nextInt();

                    if (mark < 0) {
                        System.out.println("Marks cannot be negative! Please enter again.");
                    }
                } while (mark < 0);

                marks[i][j] = mark;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.println("Physics: " + marks[i][0] + 
                               ", Chemistry: " + marks[i][1] + 
                               ", Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

    }
}
