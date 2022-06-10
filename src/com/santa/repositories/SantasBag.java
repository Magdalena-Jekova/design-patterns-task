package com.santa.repositories;

import com.santa.toys.Toy;
import java.util.ArrayList;
import java.util.List;

public class SantasBag {
    List<Toy> toys;

    public SantasBag(){
        toys = new ArrayList<Toy>();
    }

    public void addToy(Toy toy){
        toys.add(toy);
        System.out.println("A " + toy.getType() + " has been added to Santa's bag.");
    }

    public void giveToysToChildren(){
        toys.clear();
        System.out.println("Merry Christmas, ho-ho-ho!");
    }
}
