package com.amcsoftware;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String manufacturerName;
    private BigDecimal price;
    private EngineType engineType;
    private String color;
    private int numberOfDoors;


    public Car(String manufacturerName, BigDecimal price, EngineType engineType, String color, int numberOfDoors) {
        this.manufacturerName = manufacturerName;
        this.price = price;
        this.engineType = engineType;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors && Objects.equals(manufacturerName, car.manufacturerName) && Objects.equals(price, car.price) && Objects.equals(engineType, car.engineType) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturerName, price, engineType, color, numberOfDoors);
    }


    @Override
    public String toString() {
        return "Car{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
