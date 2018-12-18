package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

import java.util.Objects;

public class Car {
    private String carModel;
    private String carClass;
    private int carWeight;
    private Driver driver;
    private Engine engine;
    private Person person;

    public Car() {
    }

    public Car(String carModel, String carClass, int carWeight, Driver driver, Engine engine, Person person) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
        this.person = person;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public Person getPerson() {
        return person;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Car Model: " + carModel + ". " + " Car Class: " + carClass + ". " + " CarWeight: " + carWeight + ". " + "\nDriver Information: " + person.getFullName() + ". " + " Age: " + person.getAge()
                + ". " + "\nDriver experiens: " + driver.getDrivingExperiens() + ". " + "\nEngine Information: " + engine.getPower() + ". " + engine.getProductivity() + ". ");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight=" + carWeight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", person=" + person +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carWeight == car.carWeight &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(carClass, car.carClass) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(person, car.person);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carModel, carClass, carWeight, driver, engine, person);
    }
}
