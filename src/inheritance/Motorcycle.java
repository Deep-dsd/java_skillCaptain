package inheritance;

public class Motorcycle extends Vehicle {
    int engineCapacity;
    public Motorcycle(int engineCapacity, String brand, String model, int manufacturingYear, double rentalPrice){
        super(brand, model, manufacturingYear, rentalPrice);
        this.engineCapacity = engineCapacity;
    }

    public String showEngineCapacity(){
        return "This " + this.brand + ", " + this.model + " has " + this.engineCapacity + "ltr engine.";
    }

    public String showVehicleInformation() {
        return super.showVehicleInformation() + " It has a " + this.engineCapacity + "ltr engine.";
    }
}
