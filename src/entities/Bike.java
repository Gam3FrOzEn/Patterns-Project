package entities;

import abstractfactory.Gift;

public class Bike implements Gift {
    @Override
    public void get() {
        System.out.println("Successful");
    }
}
