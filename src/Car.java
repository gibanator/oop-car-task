class Car{
    public String brand, model;
    public int amountOfFuel;

    public void brake(){
        System.out.println('Car is breaking');
    }

    public void accelerate(){
        System.out.println('Car is accelerating');
        amountOfFuel--;
    }

    public void printData(){
        System.out.println('Brand: ' + brand + '\nModel: ' + model + '\nFuel: ' + amountOfFuel);
    }
}