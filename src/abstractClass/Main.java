package abstractClass;


import java.util.ArrayList;
import java.util.Objects;

class VehicleInventory{
    ArrayList<Car> cars= new ArrayList<Car>();
    ArrayList<Motorcycle> motorcycles = new ArrayList<Motorcycle>();
    //Add Vehicles to the Inventory
    void addCar(int numDoors, String fuelType, String make, String model, int year, double price){
        Car car = new Car(numDoors, fuelType, make, model, year, price);
        this.cars.add(car);
    }
    void addMotorcycle(boolean hasSidecar, int engineCapacity, int hp, String make, String model, int year, double price){
        Motorcycle motorcycle = new Motorcycle(hasSidecar, engineCapacity, hp, make, model, year, price);
        this.motorcycles.add(motorcycle);
    }
    //Show Inventory vehicle details
    void showInventory(String vehicleType){
        if (Objects.equals(vehicleType, "car")){
            for (int i = 0; i < this.cars.size(); i++) {
                cars.get(i).displayDetails();
                System.out.println();
            }
        } else if (Objects.equals(vehicleType, "motorcycle")) {
            for (int i = 0; i < this.motorcycles.size(); i++) {
                motorcycles.get(i).displayDetails();
                System.out.println();
            }
        }
        else{
            System.out.println("Please provide a correct vehicle type: 'car' or 'motorcycle'.");
        }
    }
    //Searching based on certain criteria
    void searchVehicleByBrand(String vehicleType, String brand){

        if (Objects.equals(vehicleType, "car")){
            boolean checker = false;
            for (int i = 0; i < this.cars.size(); i++) {
                String maker = cars.get(i).getMake().substring(10);
                if (Objects.equals(maker, brand)){
                    checker = true;
                    cars.get(i).displayDetails();
                    System.out.println();
                }
            }
            if(!checker){
                System.out.println("No " + vehicleType + " of this brand is available.");
            }

        } else if (Objects.equals(vehicleType, "motorcycle")) {
            boolean checker = false;
            for (int i = 0; i < this.motorcycles.size(); i++) {
                String maker = cars.get(i).getMake().substring(10);
                if (Objects.equals(maker, brand)){
                    checker = true;
                    motorcycles.get(i).displayDetails();
                    System.out.println();
                }
            }
            if(!checker){
                System.out.println("No " + vehicleType + " of this brand is available.");
            }
        }
        else{
            System.out.println("Please provide a correct vehicle type: 'car' or 'motorcycle'.");
        }
    }

    void searchByPriceRange( String vehicleType, double minPrice, double maxPrice){
        if (Objects.equals(vehicleType, "car")){
            boolean checker = false;
            for (int i = 0; i < this.cars.size(); i++) {
                double amount = Double.parseDouble(cars.get(i).getPrice().substring(16));
                if (amount >= minPrice && amount <= maxPrice){
                    checker = true;
                    cars.get(i).displayDetails();
                    System.out.println();
                }
            }
            if(!checker){
                System.out.println("No " + vehicleType + " is available in this price range.");
            }

        } else if (Objects.equals(vehicleType, "motorcycle")) {
            boolean checker = false;
            for (int i = 0; i < this.motorcycles.size(); i++) {
                double amount = Double.parseDouble(motorcycles.get(i).getPrice().substring(16));
                if (amount >= minPrice && amount <= maxPrice){
                    checker = true;
                    motorcycles.get(i).displayDetails();
                    System.out.println();
                }
            }
            if(!checker){
                System.out.println("No " + vehicleType + " is available in this price range.");
            }
        }
        else{
            System.out.println("Please provide a correct vehicle type: 'car' or 'motorcycle'.");
        }
    }
 //Update values of a certain vehicle
    void updateVehicleDetails(String vehicleType, int id, String propertyToUpdate, String updatedValue){
        if (Objects.equals(vehicleType, "car")){
            if(id < cars.size() && id >= 0){
                switch (propertyToUpdate){
                    case "model":
                        cars.get(id).setModel(updatedValue);
                        return;
                    case "make":
                        cars.get(id).setMake(updatedValue);
                        return;
                    case "year":
                        cars.get(id).setYear(Integer.parseInt(updatedValue));
                        return;
                    case "price":
                        cars.get(id).setPrice(Double.parseDouble(updatedValue));
                        return;
                    case "fuel type":
                        cars.get(id).setFuelType(updatedValue);
                        return;
                    case "number of doors":
                        cars.get(id).setNumDoors(Integer.parseInt(updatedValue));
                        return;
                    default:
                        System.out.println("Provide correct information.");
                }
            }
            else{
                System.out.println("Id is out of range.");
            }

        } else if (Objects.equals(vehicleType, "motorcycle")) {
            if(id < motorcycles.size() && id >= 0){
                switch (propertyToUpdate){
                    case "model":
                        motorcycles.get(id).setModel(updatedValue);
                        return;
                    case "make":
                        motorcycles.get(id).setMake(updatedValue);
                        return;
                    case "year":
                        motorcycles.get(id).setYear(Integer.parseInt(updatedValue));
                        return;
                    case "price":
                        motorcycles.get(id).setPrice(Double.parseDouble(updatedValue));
                        return;
                    case "sidecar":
                        motorcycles.get(id).setHasSidecar(Boolean.parseBoolean(updatedValue));
                        return;
                    case "number of doors":
                        motorcycles.get(id).setEngineCapacity(Integer.parseInt(updatedValue));
                        return;
                    default:
                        System.out.println("Provide correct information.");
                }
            }
            else{
                System.out.println("Id is out of range.");
            }

        }
        else{
            System.out.println("Please provide a correct vehicle type: 'car' or 'motorcycle'.");
        }
    }
    //Remove vehicle from inventory
    void removeVehicle(String vehicleType, int id){
        if (Objects.equals(vehicleType, "car")){
            if(id < cars.size() && id >= 0){
                cars.remove(id);
            }
            else{
                System.out.println("Id is out of range.");
            }
        } else if (Objects.equals(vehicleType, "motorcycle")) {
            if(id < motorcycles.size() && id >= 0){
                motorcycles.remove(id);
            }
            else{
                System.out.println("Id is out of range.");
            }
        }
        else{
            System.out.println("Please provide a correct vehicle type: 'car' or 'motorcycle'.");
        }
    }


}



public class Main {
    public static void main(String[] args){
        //creating the Inventory
        VehicleInventory inventory = new VehicleInventory();

        //Adding vehicle to the inventory
        inventory.addCar(4, "petrol", "BMW", "GLS", 2020, 3500000.00);
        inventory.addCar(2, "electric", "Tesla","Roadster", 2021, 9000000.00);
        inventory.addCar(4, "electric", "Tesla","Cybertruck", 2024, 9500000.00);
        inventory.addMotorcycle(false, 17, 300, "Royal Enfield", "Meteor", 2020, 300000.00);
        inventory.addMotorcycle(false, 20, 350, "KTM", "Duke", 2021, 400000.00);

        //Showing all Inventory Items
//        inventory.showInventory("motorcycle");
//        inventory.showInventory("car");

        //search operations on Inventory
//        inventory.searchVehicleByBrand("car", "BMW");
//        inventory.searchByPriceRange("motorcycle", 200000.00, 400000.00);

        //Update Inventory vehicle properties
//        inventory.updateVehicleDetails("car", 2, "price", "9800000.00");

        //Remove Vehicle from the inventory
//        inventory.removeVehicle("car", 5);

//       inventory.showInventory("car");
    }
}
