public class Car extends Vehicle {

    private int numberOfSeats;

    // Initialize Car details and pass common attributes to parent Vehicle class
    public Car(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int numberOfSeats
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Calculate rental cost : Base rate + Extra charge (200 per seat per day)
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getNumberOfSeats() * 200 * days);
    }
}