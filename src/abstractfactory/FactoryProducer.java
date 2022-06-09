package abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory){
        if (factory.equals("GIFT")) {
            return new GiftFactory();
        }

        System.out.println("Unknown Factory");
        return null;
    }
}
