package entities;

public class SantaClaus {

    private static SantaClaus instance;

    private SantaClaus() {

    }

    public static SantaClaus getInstance() {
        if (instance == null)
            instance = new SantaClaus();

        return instance;
    }

}
