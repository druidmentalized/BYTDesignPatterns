package org.project.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private final List<IObserver> observers = new ArrayList<>();
    private final String productName;
    private final int productPrice;
    private String availability;

    public Subject(String productName, int productPrice, String availability) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        var previousAvailability = this.availability;
        this.availability = availability;
        IO.println("Availability changed from " + previousAvailability + " to " + availability + ".");
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserver observer) {
        if (observer instanceof ConcreteObserver(String userName)) {
            IO.println("Observer Added : " + userName);
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observer instanceof ConcreteObserver(String userName)) {
            IO.println("Observer Removed : " + userName);
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        IO.println("Product Name :" + productName + ", product Price : " + productPrice
                + " is Now " + availability + ". So, notifying all Registered users ");
        IO.println();

        for (var observer : observers) {
            observer.update(availability);
        }
    }
}
