package entities;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Board implements Observable {

    private List<Observer> observers;
    private String gift;

    public Board() {
        this.observers = new ArrayList<>();
    }

    public void showDollOnBoard() {
        System.out.println("Doll");
        this.gift = "Doll";
        this.notifyObservers();
    }

    public void showBikeOmBoard() {
        System.out.println("Bike");
        this.gift = "Bike";
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setBoard(this);

    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setBoard(null);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }

    }

    @Override
    public String getGift() {
        return this.gift;
    }
}
