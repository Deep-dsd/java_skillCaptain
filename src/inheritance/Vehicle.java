package inheritance;

public class Vehicle {
    String brand;
    String model;
    int manufacturingYear;
    double rentalPrice;

    public Vehicle(String brand, String model, int manufacturingYear, double rentalPrice){
        this.brand = brand;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.rentalPrice = rentalPrice;
    }

    public String showVehicleInformation(){
        return "This is a " + this.brand + ", model name " + this.model + " and manufacturing year " + this.manufacturingYear + ". Rental price of this vehicle is " + this.rentalPrice + ".";
    }
}
