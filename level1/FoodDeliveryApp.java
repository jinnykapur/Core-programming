import java.util.*;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of restaurants: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create an array of restaurants
        Restaurant[] restaurants = new Restaurant[n];

        // Input details for each restaurant
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Restaurant " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Location: ");
            String location = sc.nextLine();

            System.out.print("Number of food items: ");
            int itemCount = sc.nextInt();
            sc.nextLine(); // consume newline

            String[] foodItems = new String[itemCount];
            for (int j = 0; j < itemCount; j++) {
                System.out.print("Enter food item " + (j + 1) + ": ");
                foodItems[j] = sc.nextLine();
            }

            // Create restaurant object
            restaurants[i] = new Restaurant(name, location, foodItems);
        }

        // Display details of all restaurants
        System.out.println("\n=== Restaurant Details ===");
        for (Restaurant r : restaurants) {
            r.displayDetails();
            System.out.println();
        }

        // Check food availability
        System.out.print("Enter the restaurant name to check food availability: ");
        String searchRestaurant = sc.nextLine();

        System.out.print("Enter food item to check: ");
        String searchFood = sc.nextLine();

        boolean found = false;
        for (Restaurant r : restaurants) {
            if (r.getName().equalsIgnoreCase(searchRestaurant)) {
                found = true;
                if (r.isFoodAvailable(searchFood)) {
                    System.out.println(searchFood + " is available at " + r.getName());
                } else {
                    System.out.println(searchFood + " is NOT available at " + r.getName());
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Restaurant not found.");
        }

        sc.close();
    }
}

class Restaurant {
    private String name;
    private String location;
    private String[] foodItems;

    public Restaurant(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    public void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items:");
        for (String item : foodItems) {
            System.out.println("- " + item);
        }
    }

    public boolean isFoodAvailable(String food) {
        for (String item : foodItems) {
            if (item.equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
