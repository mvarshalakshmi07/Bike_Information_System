// Bike Information System
import java.util.*;
class BikeDetails {
    String brand;
    String model;
    int year;
    int engineCapacity;
    int price;
    String colour;

    BikeDetails(String brand, String model, int year, int engineCapacity, int price, String colour) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.colour = colour;
    }

    void displayBikeDetails() {
        System.out.println("\n--- Bike Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Price: " + price);
        System.out.println("Colour: " + colour);
    }
}

class CustomerDetails {
    String name;
    long phNo;
    String address;
    long licenseNumber;

    CustomerDetails(String name, long phNo, String address, long licenseNumber) {
        this.name = name;
        this.phNo = phNo;
        this.address = address;
        this.licenseNumber = licenseNumber;
    }

    void displayCustomerDetails() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Name: " + name);
        System.out.println("Phone No: " + phNo);
        System.out.println("Address: " + address);
        System.out.println("License Number: " + licenseNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Brand name: ");
        String brand = s.nextLine();

        System.out.print("Enter the Bike Model: ");
        String model = s.nextLine();

        System.out.print("Enter the Model Year: ");
        int year = s.nextInt();

        System.out.print("Enter the Engine Capacity: ");
        int engineCapacity = s.nextInt();

        System.out.print("Enter the Price: ");
        int price = s.nextInt();
        s.nextLine();

        System.out.print("Enter the Colour: ");
        String colour = s.nextLine();

        
        System.out.print("Enter Customer Name: ");
        String name = s.nextLine();

        System.out.print("Enter Phone no: ");
        long phNo = s.nextLong();
        s.nextLine(); 

        System.out.print("Enter Address: ");
        String address = s.nextLine();

        System.out.print("Enter the License Number: ");
        long licenseNumber = s.nextLong();
        BikeDetails b1 = new BikeDetails(brand, model, year, engineCapacity, price, colour);
        CustomerDetails c1 = new CustomerDetails(name, phNo, address, licenseNumber);
        b1.displayBikeDetails();
        c1.displayCustomerDetails(); 
    }
}
