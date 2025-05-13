package main.java.com.hw8;

public class Main8 {
    public static void main (String[] args){

        //У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
        // щоб у номерах шатлів не траплялося нещасливих чисел.
        // Напишіть функцію, яка виводить усі номери таких шатлів.


        int counter = 0;

        while (counter <= 100) {
            for (int i = 0; i <=999; i++) {

                if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 % 10 == 4 || i / 10 % 10 == 9) {
                    continue;
                } else if (counter == 101){
                    break;
                }

                System.out.println(counter + ": " + i);
                counter++;
            }
        }
    }
}


