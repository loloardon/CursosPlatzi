from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("246HYS",Account("Angel Ardon","2398367230114"))
    print(vars(car))
    print(vars(car.driver))


