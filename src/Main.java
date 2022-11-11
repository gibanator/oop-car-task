class Main{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Fiat";
        car1.model = "500";
        car1.amountOfFuel = 1;
        car1.printData();
        car1.brake();
        car1.accelerate();
        car1.printData();
        car1.accelerate();
        car1.refuel(10);
        car1.printData();
        Car car2 = new Car("Nissan", "GT-R", 30);
        car2.printData();
    }
}
