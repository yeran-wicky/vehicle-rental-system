public class Car extends Vehicle {

    private int numberOfSeats;

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
}