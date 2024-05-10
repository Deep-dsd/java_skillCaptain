package abstractClass;

import java.util.Objects;

class Car extends Vehicle{
    private int numDoors;
    private String fuelType;
    //Parameterized Constructor to create objects from this class
    Car(int numDoors, String fuelType, String make, String model, int year, double price){
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    //Method to calculate car mileage
    String calculateMileage(){
        if(Objects.equals(this.fuelType, "petrol")){
            return "Mileage of this car is 15-40 Kmpl";
        } else if (Objects.equals(this.fuelType, "diesel")) {
            return "Mileage of this car is 20-40 Kmpl";
        } else{
            return "Mileage of this car is 300-450 Km(per charge)";
        }
    }
    //abstract class method.
    void displayDetails(){
        System.out.println(this.getMake() + ", " + this.getModel() + ".");
        System.out.println(this.getYear() + ".");
        System.out.println("This car is currently priced at " + this.getPrice().substring(16) + ".");
        System.out.println("This is a " + this.numDoors+ " door, " + this.fuelType + " engine car.");
    }

    //Getters to give access to individual properties
    String getNumDoors(){
        return "Number of door is " + numDoors;
    }

    String getFuelType(){
        return "Fuel type is " + fuelType;
    }

    void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }


}
