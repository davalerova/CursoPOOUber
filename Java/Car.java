public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String licence, Account driver){
        this.driver = driver;
        this.license = licence;
    }

    void printDataCar(){
        System.out.println("Licencia: "+ this.license + " Conductor :" + this.driver.name);
    }
}
