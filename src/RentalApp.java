import java.util.*;

public class RentalApp {

    public static ArrayList <Vehicle> vArrList = new ArrayList <Vehicle> ();
    public static double totalIncome;
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

                        boolean isIdExists = false;
                        for (Vehicle v : vArrList) {
                            if (v.getVehicleId().equals(vehicleId)) {
                                isIdExists = true;
                                break;
                            }
                        }
                        if (isIdExists == true){
                            System.out.println("\nVehicle ID already exists! Try a different one");
                        }else {
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
                        }

                    }else if (chosenVehic == 2) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();

                        boolean isIdExists = false;
                        for (Vehicle v : vArrList) {
                            if (v.getVehicleId().equals(vehicleId)) {
                                isIdExists = true;
                                break;
                            }
                        }
                        if (isIdExists == true){
                            System.out.println("\nVehicle ID already exists! Try a different one");
                        }else {
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
                        }

                    }else if (chosenVehic == 3) {
                        System.out.print("Enter vehicle ID: ");
                        String vehicleId = sc.next();

                        boolean isIdExists = false;
                        for (Vehicle v : vArrList) {
                            if (v.getVehicleId().equals(vehicleId)) {
                                isIdExists = true;
                                break;
                            }
                        }
                        if (isIdExists == true){
                            System.out.println("\nVehicle ID already exists! Try a different one");
                        }else {
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
                    }
                }else if (choice == 2){

                    if (vArrList.isEmpty()){
                        System.out.println("No vehicles available for now");
                    }else{
                        for (Vehicle v : vArrList) {
                            v.displayDetails();
                            System.out.println();
                        }
                    }

                }else if (choice == 3){
                    System.out.println("Enter vehicle ID: ");
                    String vId = sc.next();

                    Vehicle found = null;
                    for (Vehicle v : vArrList) {
                        if (v.getVehicleId().equals(vId)){
                            found = v;
                            break;
                        }
                    }

                    if (found == null){
                        System.out.println("Vehicle not available");
                    }else{
                        if (!found.getIsAvailable()){
                            System.out.println("Vehicle is already rented");
                        }else{
                            System.out.print("Enter number of days: ");
                            int days = sc.nextInt();

                            if (days <= 0) {
                                System.out.println("Days must be greater than zero");
                            }else{
                                double cost = found.calculateRentalCost(days);
                                found.rentVehicle();

                                totalIncome = totalIncome + cost;
                            }
                        }
                    }

                }else if (choice == 4){
                    System.out.print("Enter vehicle ID to return: ");
                    String id = sc.next();

                    for (Vehicle v : vArrList) {
                        if (v.getVehicleId().equals(id)) {
                            v.returnVehicle();
                            break;
                        }
                    }

                }else if (choice == 5){
                    System.out.print("\nSearch vehicle by ID selected.");
                    System.out.print("Enter vehicle ID: ");
                    String vId = sc.next();

                    boolean isFound = false;

                    for (Vehicle v : vArrList) {
                        if (v.getVehicleId().equals(vId)) {
                            v.displayDetails();
                            isFound = true;
                            break;
                        }
                    }

                    if (!isFound) {
                        System.out.println("Vehicle not found in the system.");
                    }

                }else if (choice == 6){

                }else if (choice == 7) {
                    System.out.println("\nTerminatingGood bye!");
                    sc.close();
                    break;
                }else{
                    System.out.println("Invalid input. Try again");
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
