package entities;

import observer.Observable;
import observer.Observer;

public class Elf implements Observer {

    private Observable board;
    private String name;

    public Elf(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (this.board == null) {
            System.out.println("No board set");
            return;
        }

        System.out.println(this.name + "gets a gift");
    }

    @Override
    public void setBoard(Observable board) {
        this.board = board;
    }
}
