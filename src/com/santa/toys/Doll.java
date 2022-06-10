package com.santa.toys;

public class Doll implements Toy {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
