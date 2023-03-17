package com.amcsoftware;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car lexus = new Car("Lexus", new BigDecimal("45590"), EngineType.ELECTRIC, "Midnight Blue", 4);
        Car ferrari = new Car("ferrari", new BigDecimal("334990"), EngineType.PETROL, "white",2);
        Car bmw = new Car("BMW", new BigDecimal("84990"), EngineType.PETROL, "grey",2);

        Dealership dealership = new Dealership("Jessie Deal Boo", 3);

        dealership.addCar(lexus);
        dealership.addCar(ferrari);
        dealership.addCar(bmw);

        System.out.println("Located car is " + dealership.findCarByManufacturer("bmw"));

        System.out.println("Cars in inventory:\n " + Arrays.toString(dealership.getInstockInventory()));

    }

}
