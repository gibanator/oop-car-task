class Car{
    public String brand, model;
    public int amountOfFuel;

    public void brake(){
        System.out.println("Car is breaking");
    }

    public void accelerate(){
        if (amountOfFuel>0) {
            System.out.println("Car is accelerating");
            amountOfFuel--;
        }
        else {
            System.out.println("Car cannot accelerate. Amount of fuel is 0.");
        }
    }

    public void refuel(int amount){
        System.out.println("Fuel in the tank: " + amountOfFuel);
        System.out.println("Amount to be filled in: " + amount);
        amountOfFuel+=amount;
        System.out.println("Fuel on the tank after the refuel: " + amountOfFuel);
    }

    public void printData(){
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nFuel: " + amountOfFuel);
    }
}