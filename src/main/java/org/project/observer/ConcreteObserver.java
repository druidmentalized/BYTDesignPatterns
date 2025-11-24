package org.project.observer;

public class ConcreteObserver implements IObserver {
    private final String userName;

    public ConcreteObserver(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

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
