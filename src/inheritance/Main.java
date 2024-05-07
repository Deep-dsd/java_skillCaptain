package inheritance;

public  class Main {
    public static void main(String[] args){
      Car car1 = new Car(4, "Tesla", "roadster", 2021, 1000.00);

      Motorcycle motorcycle1 = new Motorcycle(13, "Royal Enfield", "Himalayan-450", 2021, 300.00);

        System.out.println(car1.showVehicleInformation());
        System.out.println(car1.showNumberOfSeats());
        System.out.println();
        System.out.println(motorcycle1.showVehicleInformation());
        System.out.println(motorcycle1.showEngineCapacity());
    }


}

