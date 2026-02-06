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
            System.out.print("\nChoose an option: ");

            try {
                int choice = sc.nextInt();

                if (choice == 1){
                    System.out.println("Add a vehicle option selected.");
                    System.out.println("List of vehicles available");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Van");
                    System.out.print("Choose vehicle type: ");

                    int chosenVehic = sc.nextInt();

                    if (chosenVehic == 1) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter number of seats: ");
                        int numberOfSeats = sc.nextInt();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();
                        boolean isAvailable = true;

                        vArrList.add(new Car(vehicleId, brand, model, baseRatePerDay, isAvailable, numberOfSeats));
                        System.out.println("\nYour car has been successfully added to the system");

                    }else if (chosenVehic == 2) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter engine capacity: ");
                        int engineCapacityCC = sc.nextInt();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();
                        boolean isAvailable = true;

                        vArrList.add(new Bike(vehicleId, brand, model, baseRatePerDay, isAvailable, engineCapacityCC));
                        System.out.println("\nYour bike has been successfully added to the system");

                    }else if (chosenVehic == 3) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter cargo capacity(Kg): ");
                        double cargoCapacityKg = sc.nextDouble();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();
                        boolean isAvailable = true;

                        vArrList.add(new Van(vehicleId, brand, model, baseRatePerDay, isAvailable, cargoCapacityKg));
                        System.out.println("\nYour van has been successfully added to the system");
                    }
                }else if (choice == 2){
                    for (Vehicle v : vArrList) {
                        v.displayDetails();
                    }
                    for (Vehicle v : vArrList) {
                        v.displayDetails();
                    }
                    for (Vehicle v : vArrList) {
                        v.displayDetails();
                    }
                }else if (choice == 3){
                    System.out.println("Vehicle types: ");
                    System.out.println("1. Car\n2.Bike\n3.Van");
                    System.out.print("Choose vehicle type: ");


                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
