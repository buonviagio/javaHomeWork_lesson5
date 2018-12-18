package com.company.details;

import java.util.Objects;

public class Engine {
    private String power;
    private String productivity;

    public Engine(String power, String productivity) {
        this.power = power;
        this.productivity = productivity;
    }

    public String getPower() {
        return power;
    }

    public String getProductivity() {
        return productivity;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setProductivity(String productivity) {
        this.productivity = productivity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", productivity='" + productivity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(power, engine.power) &&
                Objects.equals(productivity, engine.productivity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(power, productivity);
    }
}
