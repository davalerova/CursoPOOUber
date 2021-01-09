class Main{
    public static void main(String[] args) {
        Car car = new Car();
        car.license = "HJP25E";
        car.driver = "David Valero";
        car.passengers = 4;

        System.out.println("Licencia: " + car.license);

        car.printDataCar();
    }
}