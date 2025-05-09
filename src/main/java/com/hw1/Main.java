package main.java.com.hw1;

public class Main {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 5;
        int side3 = 7;

        int volume = side1 * side2 * side3;
        int length = (side1 + side2 + side3) * 4;

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + length);
    }
}