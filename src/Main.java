import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Calculator.Calculator;
import Vehicle.Car;
import Vehicle.Garage;
import Vehicle.Tank;
import Vehicle.Vehicle;
import abc.C;

public class Main {
    public static void main(String[] args) {

        //dziedziczenie

        //single
        Car car = new Car();
        car.setEnginePower(500);
        car.setNumberOfWheels(5);
        car.setName("Porshe");

        //Multilevel
        C c = new C();
        c.setC(12);
        c.setA(11);
        c.setB(13);

        //Hierarchical
        Tank tank = new Tank();
        car.setName("Mercedes");
        tank.setName("Leopard");
        car.setNumberOfWheels(4);
        tank.setNumberOfCatterpillars(2);

        //POLIMORFIZM
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.speak();
        dog.speak();
        cat.speak();

        //GARAGE
/*
        Garage garage = new Garage();
        Vehicle car1 = new Vehicle();
        car1.setName("Porshe");
        Vehicle car2 = new Vehicle();
        car2.setName("Mercedes");
        garage.addVehicleToSpace(car1, 0);
        garage.addVehicleToSpace(car2, 1);
        garage.addVehicleToSpace(car, 3);
        garage.deleteVehicleFromSpace(1);
        garage.checkSpace(2);
        garage.spaceInGarage();
        System.out.println(garage.showCarsInGarage());*/

    //OVERLOADING

    Calculator calculator = new Calculator();
        System.out.println(calculator.add(10.5,15.5));
        System.out.println(calculator.add(10,15));
        System.out.println(calculator.add(10,13,12));
        System.out.println(calculator.add(13,12.3,10.1));



    }


}
