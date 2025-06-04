package main.java.com.hw13;

public class IPhone implements Smartphones, IOS{
    String model;
    public IPhone(String model) {
        this.model = model;
    }

    @Override
    public void opSystem() {
        System.out.println(model = "has an IOS");
    }

    @Override
    public void call() {
        System.out.println(model = "can make a call");
    }

    @Override
    public void sms() {
        System.out.println(model = "can send sms");
    }

    @Override
    public void internet() {
        System.out.println(model = "can use an internet");
    }
}
