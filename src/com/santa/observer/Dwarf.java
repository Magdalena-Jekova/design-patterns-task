package com.santa.observer;

import com.santa.factories.ToyFactory;
import com.santa.repositories.SantasBag;
import java.util.List;

public class Dwarf implements Observer {
    private SantasBag bag;

    public Dwarf(SantasBag bag){
        this.bag = bag;
    }

    @Override
    public void update(List<String> toys) {
        for(String toy: toys){
            bag.addToy(ToyFactory.genToy(toy));
        }
    }
}
