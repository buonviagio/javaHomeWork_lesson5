package com.company.demo;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Demo {
    public static void main(String[] args) {
        Driver person1 = new Driver("5", "Ivan Ivanov", 32);
        Driver person2 = new Driver("10", "Petya Petrov", 25);

        Engine rollsRoyce = new Engine("very powerfull", "maximum");

        Car audi = new SportCar("Audi", "Sport", 1000, person1, rollsRoyce, "380", person1);
        audi.printInfo();
        System.out.println(audi);

        System.out.println(person1.equals(person2));
    }
}
