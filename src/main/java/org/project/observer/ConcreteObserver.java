package org.project.observer;

public record ConcreteObserver(String userName) implements IObserver {

    public void addSubscriber(ISubject subject) {
        subject.registerObserver(this);
    }

    public void removeSubscriber(ISubject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(String availability) {
        IO.println("Hello " + userName + ", Product is now " + availability);
    }
}
