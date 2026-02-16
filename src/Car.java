// Created a subclass 'Car' extended from 'Vehicle' class
// This inherits common attributes and methods from its parent (Vehicle) class
public class Car extends Vehicle {

    // Additional attribute unique to this class
    private int numberOfSeats;

    // Parameterized constructor which initializes parent's attributes and also
    // the attribute unique to this class
    public Car(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int numberOfSeats
    ){
        // 'super' calls the 'Vehicle' constructor to set common fields
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        // Set the 'Car' specific fields
        this.numberOfSeats = numberOfSeats;
    }

    // Getter methods to fetch the number of seats
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Car rental cost calculation using the abstract method
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getNumberOfSeats() * 200 * days);
    }
}