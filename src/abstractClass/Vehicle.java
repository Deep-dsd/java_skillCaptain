package abstractClass;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    Vehicle(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    String getMake(){
        return "This is a " + make;
    }

    String getModel(){
        return  "Model is " + model;
    }

    String getYear(){
        return "Manufacturing year of this vehicle is " + year;
    }

    String getPrice(){
        return "Market price is " + price;
    }

    void setMake(String make){
        this.make = make;
    }
    void setModel(String model){
        this.model = model;
    }
    void setYear(int year){
        this.year = year;
    }
    void setPrice(double price){
        this.price = price;
    }
    abstract void displayDetails();
}
