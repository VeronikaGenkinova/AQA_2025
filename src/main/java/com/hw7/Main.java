package main.java.com.hw7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Зробити гру, в якій потрібно відгадати ціле число,
//        яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3)



        int someNumber = (int)(Math.random() * 11);

        System.out.println("Try to guess the number");
        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<=3; i++){
            int number;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Only number are allowed. Try again");
                break;
            }

            if (number > someNumber) {
                System.out.println("Try a lower number");
            } else if (number < someNumber) {
                System.out.println("Try a higher number");
            } else {
                System.out.println("You are the winner");
            }
        }

    }
}