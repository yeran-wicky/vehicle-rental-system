import java.util.*;

public class RentalApp {

    private static ArrayList <Vehicle> vArrList = new ArrayList <Vehicle> ();
    private static double totalIncome;
    private static Scanner sc = new Scanner (System.in);

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
                    System.out.println("\nAdd a vehicle option selected.");
                    System.out.println("List of vehicle types:");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Van");
                    System.out.println("4. Cycle");
                    System.out.print("Choose vehicle type: ");

                    int chosenVehic = sc.nextInt();

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
                        System.out.println("\nVehicle ID already exists! Try a different one.");
                    }else {
                        System.out.print("Enter vehicle brand: ");
                        String brand = sc.next();
                        System.out.print("Enter vehicle model: ");
                        String model = sc.next();
                        System.out.print("Enter base rate per day: ");
                        double baseRatePerDay = sc.nextDouble();
                        boolean isAvailable = true;

                        if (chosenVehic == 1) {
                            System.out.print("Enter number of seats: ");
                            int numberOfSeats = sc.nextInt();
                            Car c = new Car(vehicleId, brand, model, baseRatePerDay, isAvailable, numberOfSeats);
                            c.setVehicleId(vehicleId);
                            c.setBrand(brand);
                            c.setModel(model);
                            c.setBaseRatePerDay(baseRatePerDay);
                            c.setIsAvailable(isAvailable);
                            c.setNumberOfSeats(numberOfSeats);

                            vArrList.add(c);
                            System.out.println("\nYour car has been successfully added to the system!");

                        }else if (chosenVehic == 2) {
                            System.out.print("Enter engine capacity: ");
                            int engineCapacityCC = sc.nextInt();
                            Bike b = new Bike(vehicleId, brand, model, baseRatePerDay, isAvailable, engineCapacityCC);
                            b.setVehicleId(vehicleId);
                            b.setBrand(brand);
                            b.setModel(model);
                            b.setBaseRatePerDay(baseRatePerDay);
                            b.setIsAvailable(isAvailable);
                            b.setEngineCapacityCC(engineCapacityCC);

                            vArrList.add(b);
                            System.out.println("\nYour bike has been successfully added to the system!");

                        }else if (chosenVehic == 3) {
                            System.out.print("Enter cargo capacity(Kg): ");
                            double cargoCapacityKg = sc.nextDouble();
                            Van v = new Van(vehicleId, brand, model, baseRatePerDay, isAvailable, cargoCapacityKg);
                            v.setVehicleId(vehicleId);
                            v.setBrand(brand);
                            v.setModel(model);
                            v.setBaseRatePerDay(baseRatePerDay);
                            v.setIsAvailable(isAvailable);
                            v.setCargoCapacityKg(cargoCapacityKg);
                            vArrList.add(new Van(vehicleId, brand, model, baseRatePerDay, isAvailable, cargoCapacityKg));
                            System.out.println("\nYour van has been successfully added to the system!");

                        }else if (chosenVehic == 4) {
                            System.out.print("Enter gear count: ");
                            int gearCount = sc.nextInt();
                            Cycle y = new Cycle(vehicleId, brand, model, baseRatePerDay, isAvailable, gearCount);
                            y.setVehicleId(vehicleId);
                            y.setBrand(brand);
                            y.setModel(model);
                            y.setBaseRatePerDay(baseRatePerDay);
                            y.setIsAvailable(isAvailable);
                            y.setGearCount(gearCount);
                            vArrList.add(new Cycle(vehicleId, brand, model, baseRatePerDay, isAvailable, gearCount));
                            System.out.println("\nYour cycle has been successfully added to the system!");
                        }
                    }

                }else if (choice == 2){
                    System.out.println("\nView all vehicles option selected.");

                    if (vArrList.isEmpty()){
                        System.out.println("No vehicles available for now.");
                    }else{
                        for (Vehicle v : vArrList) {
                            v.displayDetails();
                            System.out.println();
                        }
                    }

                }else if (choice == 3){
                    System.out.println("\nRent a vehicle option selected.");

                    if (vArrList.isEmpty()){
                        System.out.println("No vehicles available for now.");
                    }else{
                        System.out.print("Enter vehicle ID: ");
                        String vId = sc.next();

                        Vehicle found = null;
                        for (Vehicle v : vArrList) {
                            if (v.getVehicleId().equals(vId)){
                                found = v;
                                break;
                            }
                        }

                        if (found == null){
                            System.out.println("No available vehicle found for this ID");
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
                    }

                }else if (choice == 4){
                    System.out.println("\nReturn a vehicle option selected.");
                    if (vArrList.isEmpty()){
                        System.out.println("No vehicles have been added yet to return.");
                        continue;
                    }
                    System.out.print("Enter vehicle ID to return: ");
                    String id = sc.next();

                    for (Vehicle v : vArrList) {
                        if (v.getVehicleId().equals(id)) {
                            v.returnVehicle();
                            break;
                        }else{
                            System.out.println("\nNo vehicle found for this ID.");
                        }
                    }

                }else if (choice == 5){
                    System.out.println("\nSearch vehicle by ID option selected.");
                    if (vArrList.isEmpty()){
                        System.out.println("No vehicles have been added yet to return.");
                        continue;
                    }
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
                    System.out.println("\nTotal rental income earned until now: "+totalIncome);

                }else if (choice == 7) {
                    System.out.println("\nTerminating the program. Good bye!");
                    sc.close();
                    break;
                }else{
                    System.out.println("\nInvalid input. Try again");
                    sc.nextLine();
                }
            }catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Try again");
                sc.nextLine();
            }
        }
    }
}