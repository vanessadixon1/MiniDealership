package com.amcsoftware;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Dealership {
    private String name;
    private int instockLimit;
    private Car[] instockInventory;
    private int index;

    public Dealership(String name, int instockLimit) {
        this.name = name;
        this.instockLimit = instockLimit;
        instockInventory = new Car[instockLimit];
        index = 0;
    }

    public void addCar(Car car) {
        try{
            if(instockInventory[index] == null) {
                instockInventory[index] = car;
            }
            index++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("unable to add " + car.getManufacturerName() + ". The inventory is full");
        }
    }

    public Car findCarByManufacturer(String manufacturer) {
        Car  locatedCar = null;

        for(Car car : instockInventory) {
            try {
                if (car.getManufacturerName().equalsIgnoreCase(manufacturer)) {
                    locatedCar = car;
                }
            } catch (NullPointerException e) {

            }
        }
        return locatedCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstockLimit() {
        return instockLimit;
    }

    public void setInstockLimit(int instockLimit) {
        this.instockLimit = instockLimit;
    }

    public Car[] getInstockInventory() {
        return instockInventory;
    }

    public void setInstockInventory(Car[] instockInventory) {
        this.instockInventory = instockInventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealership that = (Dealership) o;
        return instockLimit == that.instockLimit && Objects.equals(name, that.name) && Arrays.equals(instockInventory, that.instockInventory);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, instockLimit);
        result = 31 * result + Arrays.hashCode(instockInventory);
        return result;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", stockLimit=" + instockLimit +
                ", currentInventory=" + Arrays.toString(instockInventory) +
                '}';
    }
}
