package main.java.com.hw13;

public class Android implements Smartphones, LinuxOS{
    String model;
    public Android(String model) {
        this.model = model;
    }

    @Override
    public void opSystem() {
        System.out.println(model = "has an Android OS");
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
