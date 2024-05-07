package inheritance;

public class Car extends Vehicle {
    int numberOfSeats;
    public Car(int numberOfSeats, String brand, String model, int manufacturingYear, double rentalPrice){
        super(brand, model, manufacturingYear, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public String showNumberOfSeats(){
        return "This " + this.brand + ", " + this.model + " has " + this.numberOfSeats + " seats.";
    }

    @Override
    public String showVehicleInformation() {
        return super.showVehicleInformation() + " It has " + this.numberOfSeats + " seats.";
    }
}
