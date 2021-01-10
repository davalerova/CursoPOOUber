class Main{
    public static void main(String[] args) {
        Car car = new Car("HJP25E", new Account("David Valero", "ASD243432342432"));
        car.passengers = 4;
        car.printDataCar();
    }
}