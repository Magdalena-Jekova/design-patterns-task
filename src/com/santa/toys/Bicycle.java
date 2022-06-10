package com.santa.toys;

public class Bicycle implements Toy {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
