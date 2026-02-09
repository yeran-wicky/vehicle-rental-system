public class Car extends Vehicle {

    private int numberOfSeats;

    //Constructors
    public Car(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int numberOfSeats
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);// Parent Constructors
        this.numberOfSeats = numberOfSeats;
    }
    // Use getter Method for Encapsulation
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Use abstract method to calculate car rental cost
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getNumberOfSeats() * 200 * days);
    }
}