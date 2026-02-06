import java.util.*;

public class RentalApp {

    public static ArrayList <Vehicle> vArrList = new ArrayList <Vehicle> ();
    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args){
        while(true) {
            System.out.println("\n===== Vehicle Rental Management System =====");
            System.out.println("1. Add a vehicle");
            System.out.println("2. View all vehicles");
            System.out.println("3. Rent a vehicle");
            System.out.println("4. Return a vehicle");
            System.out.println("5. Search vehicle by ID");
            System.out.println("6. View total rental income");
            System.out.println("7. Exit");
            System.out.println("\nChoose an option");

            try {
                int choice = sc.nextInt();

                if (choice == 1){
                    System.out.println("Add a vehicle option selected.");
                    System.out.println("Choose vehicle type: \n");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Van");

                    int chosenVehic = sc.nextInt();

                    if (chosenVehic == 1) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();

                    }else if (chosenVehic == 2) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();

                    }else if (chosenVehic == 3) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
