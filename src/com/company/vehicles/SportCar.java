package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

import java.util.Objects;

public class SportCar extends Car {
    private String maxSpead;

    public SportCar(String maxSpead) {
        this.maxSpead = maxSpead;
    }

    public SportCar(String carModel, String carClass, int carWeight, Driver driver, Engine engine, String maxSpead, Person person) {
        super(carModel, carClass, carWeight, driver, engine, person);
        this.maxSpead = maxSpead;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpead='" + maxSpead + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return Objects.equals(maxSpead, sportCar.maxSpead);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), maxSpead);
    }
}
