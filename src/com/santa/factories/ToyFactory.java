package com.santa.factories;

import com.santa.toys.Bicycle;
import com.santa.toys.Doll;
import com.santa.toys.Toy;

public class ToyFactory {

    public static Toy genToy(String toy){
        switch(toy){
            case "Bicycle":
                return new Bicycle();
            case "Doll":
                return new Doll();
            default:
                throw new IllegalArgumentException("Toy is not recognized.");
        }
    }
}
