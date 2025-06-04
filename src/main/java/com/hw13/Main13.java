package main.java.com.hw13;

public class Main13 {
    public static void main(String[] args) {
        Android android = new Android("samsung");
        IPhone iphone = new IPhone("15 Pro");

        android.opSystem();
        android.call();
        android.sms();
        android.internet();
        iphone.opSystem();
        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}
