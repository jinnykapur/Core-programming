import java.util.*;
public class MobilePhone{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter brand name of mobile phone: ");
        String brandName=sc.nextLine();

        System.out.print("Enter model of mobile phone: ");
        String modelName=sc.nextLine();

        System.out.print("Enter price of mobile phone: INR ");
        double phonePrice=sc.nextDouble();

        PhoneDetails phoneDetails=new PhoneDetails(brandName, modelName, phonePrice);
        System.out.println("\n--- Mobile Phone Details ---");
        phoneDetails.displayDetails();


    }
    static class PhoneDetails{
        private String brandName;
        private String modelName;
        private double phonePrice;

        public PhoneDetails(String brandName, String modelName, double phonePrice){
            this.brandName=brandName;
            this.modelName=modelName;
            this.phonePrice=phonePrice;
        }
        public void displayDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Phone Price: INR "+phonePrice);
        } 

    }
}