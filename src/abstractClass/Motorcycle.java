package abstractClass;

class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    private int engineCapacity;
    private final int hp;

    Motorcycle(boolean hasSidecar, int engineCapacity, int hp, String make, String model, int year, double price){
        super(make, model, year, price);
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
        this.hp = hp;
    }
    String calculateSpeed(){
        if(this.hp >= 150 && this.hp <= 300){
            return "Max speed of this car is 135 Kmph.";
        } else if (this.hp > 300 && this.hp <= 400) {
            return "Max speed of this car is 160 Kmph.";
        } else{
            return "Max speed of this car is 170 Kmph.";
        }
    }

    void displayDetails(){
        System.out.println(this.getMake() + ", " + this.getModel() + ".");
        System.out.println(this.getYear() + ".");
        System.out.println("This motorcycle is currently priced at " + this.getPrice().substring(16)+ ".");
        System.out.println("This motorcycle has " + (this.hasSidecar?"a":"no") + " sidecar.");
        System.out.println("Engine capacity of this motorcycle is " + this.engineCapacity + "l.");
    }

    String getHasSidecar(){
        return hasSidecar?"It has sidecar": "Don't have any sidecar";
    }
    String getEngineCapacity(){
        return "The engine capacity is " + engineCapacity + "L";
    }

    void setHasSidecar(boolean hasSidecar){
        this.hasSidecar = hasSidecar;
    }

    void setEngineCapacity(int engineCapacity){
        this.engineCapacity = engineCapacity;
    }


}
