import java.util.*;

public class DisplayEmployeeDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        long id = sc.nextLong();

        System.out.print("Enter Employee Salary: ");
        long salary = sc.nextLong();

        // Create Employee object
        Employee emp = new Employee(name, id, salary);

        System.out.println("\n=== Employee Details ===");
        emp.displayDetails();

        
    }

    static class Employee{
        private String name;
        private long id;
        private long salary;

        public Employee(String name, long id, long salary){
            this.name=name;
            this.id=id;
            this.salary=salary;
        }
        public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Salary: INR "+salary);
        } 
    }
}
