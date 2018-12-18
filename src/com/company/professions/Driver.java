package com.company.professions;

import java.util.Objects;

public class Driver extends Person {
    private String drivingExperiens;

    public Driver(String drivingExperiens, String fullName, int age) {
        super(fullName, age);
        this.drivingExperiens = drivingExperiens;
    }

    public String getDrivingExperiens() {
        return drivingExperiens;
    }

    public void setDrivingExperiens(String drivingExperiens) {
        this.drivingExperiens = drivingExperiens;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperiens='" + drivingExperiens + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(drivingExperiens, driver.drivingExperiens);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), drivingExperiens);
    }
}
