package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

import java.util.Objects;

public class Lorry extends Car {
    private String carrying;

    public Lorry(String carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carModel, String carClass, int carWeight, Driver driver, Engine engine, String carrying, Person person) {
        super(carModel, carClass, carWeight, driver, engine, person);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying='" + carrying + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return Objects.equals(carrying, lorry.carrying);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), carrying);
    }
}
