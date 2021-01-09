from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "AMS234"
    car.driver = "David Valero"
    print(vars(car))

    car2 = Car()
    car2.license = "FDR456"
    car2.driver = "Carlos Juno"
    print(vars(car2))
    