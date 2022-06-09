package entities;

import abstractfactory.Gift;

public class Doll implements Gift {
    @Override
    public void get() {
        System.out.println("Successful");
    }
}
