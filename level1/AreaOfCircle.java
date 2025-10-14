import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius (units): ");
        int radius = sc.nextInt();

        // Create Circle object
        Circle circle = new Circle(radius);

        // Calculate and display area
        circle.displayArea();

        sc.close();
    }
}

// Circle class
class Circle {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate and display area
    public void displayArea() {
        double area = 3.14 * radius * radius;
        System.out.printf("Area of Circle is %.2f sq. units.%n", area);
    }
}
