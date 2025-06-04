package main.java.com.hw13;

public class Main13 {
    public static void main(String[] args) {
        Android android = new Android("samsung");
        IPhone iphone = new IPhone("15 Pro");

        System.out.println(android.model);
        android.opSystem();
        android.call();
        android.sms();
        android.internet();
        System.out.println();
        System.out.println(iphone.model);
        iphone.opSystem();
        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}
