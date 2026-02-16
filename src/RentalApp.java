import java.util.*;

// This is the main class that executes the program and interacts with the user
public class RentalApp {

    // Created an arraylist to store all vehicles
    // Different subclasses are used as vehicle types (Polymorphism)
    private static ArrayList <Vehicle> vArrList = new ArrayList <Vehicle> ();
    // Variable to store the total income collected from renting vehicles
    private static double totalIncome;
    // Created scanner to read user inputs
    private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args){

        // Loop that iterates infinitely until user chooses to exit by entering
        // option '7'
        while(true) {
            // Main menu
            System.out.println("\n===== Vehicle Rental Management System =====");
            System.out.println("1. Add a vehicle");
            System.out.println("2. View all vehicles");
            System.out.println("3. Rent a vehicle");
            System.out.println("4. Return a vehicle");
            System.out.println("5. Search vehicle by ID");
            System.out.println("6. View total rental income");
            System.out.println("7. Exit");
            System.out.print("\nChoose an option: ");

            // try-catch to handle invalid user inputs
            try {
                // Get user choice from the menu and assign it to a variable 'choice'
                int choice = sc.nextInt();

                // If the user chooses 1 as the option, starts vehicle adding operation
                if (choice == 1){
                    System.out.println("\nAdd a vehicle option selected.");
                    System.out.println("List of vehicle types:");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Van");
                    System.out.println("4. Cycle");
                    System.out.print("Choose vehicle type: ");

                    // Get user input on what type of vehicle he is expecting to add
                    int chosenVehic = sc.nextInt();

                    // Asking user to enter vehicle ID he wants to add
                    System.out.print("Enter vehicle ID: ");
                    // Then assigning it to a variable 'vehicleId'
                    String vehicleId = sc.next();

                    // Checking whether the vehicle ID the user has entered is already present in the
                    // system or not.
                    boolean isIdExists = false;
                    for (Vehicle v : vArrList) {
                        if (v.getVehicleId().equals(vehicleId)) {
                            isIdExists = true;
                            break;
                        }
                    }

                    // If the id exists, then a message will be displayed saying that and vehicle addition gets aborted
                    if (isIdExists == true){
                        System.out.println("\nVehicle ID already exists! Try a different one.");
                    }else {
                        // If the id doesn't exist, then continue to collect other details
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();
                        // Newly added vehicle has to be available because it must be available for renting
                        boolean isAvailable = true;

                        // Based on what vehicle user has chosen to add, extra attribute is collected
                        // Then that vehicle object is added to the arraylist
                        // Finally, a success message is displayed telling that vehicle is added to the system
                        if (chosenVehic == 1) {
                            System.out.print("Enter number of seats: ");
                            int numberOfSeats = sc.nextInt();
                            vArrList.add(new Car(vehicleId, brand, model, baseRatePerDay, isAvailable, numberOfSeats));
                            System.out.println("\nYour car has been successfully added to the system!");

                        }else if (chosenVehic == 2) {
                            System.out.print("Enter engine capacity: ");
                            int engineCapacityCC = sc.nextInt();
                            vArrList.add(new Bike(vehicleId, brand, model, baseRatePerDay, isAvailable, engineCapacityCC));
                            System.out.println("\nYour bike has been successfully added to the system!");

                        }else if (chosenVehic == 3) {
                            System.out.print("Enter cargo capacity(Kg): ");
                            double cargoCapacityKg = sc.nextDouble();
                            vArrList.add(new Van(vehicleId, brand, model, baseRatePerDay, isAvailable, cargoCapacityKg));
                            System.out.println("\nYour van has been successfully added to the system!");

                        }else if (chosenVehic == 4) {
                            System.out.print("Enter gear count: ");
                            int gearCount = sc.nextInt();
                            vArrList.add(new Cycle(vehicleId, brand, model, baseRatePerDay, isAvailable, gearCount));
                            System.out.println("\nYour cycle has been successfully added to the system!");
                        }
                    }
                }
                // If the user chooses 2 as the option, all vehicles in the system is displayed
                else if (choice == 2){
                    System.out.println("\nView all vehicles option selected.");

                    // If there's nothing in the arraylist, which means there are no vehicles added
                    // to the system
                    if (vArrList.isEmpty()){
                        // If so, a message is printed saying that no vehicles are available
                        System.out.println("No vehicles available for now.");
                    }else{
                        // Otherwise (vehicles exist), vehicle details are printed
                        for (Vehicle v : vArrList) {
                            v.displayDetails();
                            System.out.println();
                        }
                    }
                }
                // If the user chooses 3 as the option, vehicle renting operation executes
                else if (choice == 3){
                    System.out.println("\nRent a vehicle option selected.");

                    // If there's nothing in the arraylist, which means there are no vehicles added
                    // to the system
                    if (vArrList.isEmpty()){
                        // If so, a message is printed saying that no vehicles are available
                        System.out.println("No vehicles available for now.");
                    }else{
                        // Otherwise (vehicles exist), asks user to enter the ID Of the vehicle he would like to rent
                        System.out.print("Enter vehicle ID: ");
                        // Assign that ID to a variable
                        String vId = sc.next();

                        // Then user's vehicle ID input is checked whether a vehicle is available for that ID
                        Vehicle found = null;
                        for (Vehicle v : vArrList) {
                            if (v.getVehicleId().equals(vId)){
                                found = v;
                                break;
                            }
                        }

                        // If no vehicle is found for that ID, a message is printed saying that
                        if (found == null){
                            System.out.println("No available vehicle found for this ID");
                        }else{
                            // If the vehicle is found in the system, then its availability is checked
                            // (Vehicle is rented or not)
                            if (!found.getIsAvailable()){
                                // If the availability of the vehicle returned false then 'false' is
                                // inverted to 'true', then a message is displayed saying that vehicle
                                // is rented as the condition became true
                                System.out.println("Vehicle is already rented");
                            }else{
                                // Otherwise, asks the user to enter how many days want to rent
                                System.out.print("Enter number of days: ");
                                int days = sc.nextInt();

                                // Prevents user from putting zero or less as the number of days
                                if (days <= 0) {
                                    // If he did, a message is printed saying that days must be greater than zero
                                    System.out.println("Days must be greater than zero");
                                }else{
                                    // If days count is correct, then rental cost is calculated using the
                                    // calculateRentalCost() function (Polymorphism)
                                    double cost = found.calculateRentalCost(days);
                                    // After successful renting, vehicle availability is toggled to false
                                    // using the 'rentVehicle()' function
                                    found.rentVehicle();

                                    // Then this rental cost is added to the total income earned
                                    totalIncome = totalIncome + cost;
                                }
                            }
                        }
                    }

                }
                // If the user chooses 4 as the option, vehicle returning operation executes
                else if (choice == 4){
                    System.out.println("\nReturn a vehicle option selected.");
                    // If there's nothing in the arraylist, which means there are no vehicles added
                    // to the system
                    if (vArrList.isEmpty()){
                        // If so, a message is printed saying that no vehicles added yet to return
                        System.out.println("No vehicles have been added yet to return.");
                        continue;
                    }
                    // If the arraylist is not empty, then asks the user to enter the ID of the
                    // vehicle he is going to return
                    System.out.print("Enter vehicle ID to return: ");
                    String id = sc.next();

                    // Then that ID is checked whether a vehicle is available in the system for that ID
                    for (Vehicle v : vArrList) {
                        // If there is a vehicle, then 'returnVehicle()' function executes
                        // toggling that vehicle availability to true
                        if (v.getVehicleId().equals(id)) {
                            v.returnVehicle();
                            break;
                        }else{
                            // If there's no vehicle found for the user's ID input, a message is printed saying that
                            System.out.println("\nNo vehicle found for this ID.");
                        }
                    }
                }
                // If the user chooses 5 as the option, search vehicle by ID operation executes
                else if (choice == 5){

                    // If there's nothing in the arraylist, which means there are no vehicles added
                    // to the system
                    System.out.println("\nSearch vehicle by ID option selected.");
                    if (vArrList.isEmpty()){
                        // If so, a message is printed saying that no vehicles available in the system
                        System.out.println("No vehicles have been added yet to return.");
                        continue;
                    }
                    // Otherwise, ask the user to enter the vehicle ID to search
                    System.out.print("Enter vehicle ID: ");
                    String vId = sc.next();

                    // Uses a flag to check if the ID was found or not
                    boolean isFound = false;

                    // Then checks whether there's a vehicle is available that matches to the ID
                    for (Vehicle v : vArrList) {
                        if (v.getVehicleId().equals(vId)) {
                            // If there's a matching vehicle, then its details are printed using 'displayDetails()' function
                            v.displayDetails();
                            // And the flag toggles to true
                            isFound = true;
                            break;
                        }
                    }

                    // If a vehicle is not found in the previous operation,
                    // then isFound is false. Then a message is printed that vehicle is not found in the system
                    if (!isFound) {
                        System.out.println("Vehicle not found in the system.");
                    }
                }
                // If the user chooses 6 as the option, view total rental income operation executes
                else if (choice == 6){
                    // Total rental income is displayed
                    System.out.println("\nTotal rental income earned until now: "+totalIncome);
                }
                // If the user chooses 7 as the option, program exits printing a goodbye message
                else if (choice == 7) {
                    System.out.println("\nTerminating the program. Good bye!");
                    // Closes scanner with the program termination
                    sc.close();
                    break;
                }else{
                    // If user has entered a choice outside 1~7,
                    // a message is printed saying the choice is invalid
                    System.out.println("\nInvalid input. Try again");
                    // Clears the invalid input from scanner buffer
                    sc.nextLine();
                }
            }catch (InputMismatchException e) {
                // This catches invalid input types and prints friendly error message
                // preventing the program from crashing
                System.out.println("\nInvalid input. Try again");
                // Clears the invalid input from scanner buffer
                sc.nextLine();
            }
        }
    }
}