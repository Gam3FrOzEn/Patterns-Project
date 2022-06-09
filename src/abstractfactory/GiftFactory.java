package abstractfactory;

import entities.Bike;
import entities.Doll;

public class GiftFactory extends AbstractFactory {
    @Override
    public Gift getGift(String name) {
        if (name.equals("DOLL")) {
            return new Doll();
        }
        else if (name.equals("BIKE")) {
            return new Bike();
        }

        System.out.println("Unknown gift");
        return null;
    }
}

