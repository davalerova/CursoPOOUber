from car import Car

class UberBlack(Car):

    type_car_acepted = []
    seat_material = []

    def __init__(self, license, driver, type_car_acepted, seat_material):
        super().__init__(license, driver)
        self.type_car_acepted = type_car_acepted
        self.seat_material = seat_material
    