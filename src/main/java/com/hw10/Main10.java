package main.java.com.hw10;

import java.util.Scanner;

public class Main10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n = getArrNumber(scanner, "row");
        int m = getArrNumber(scanner, "column");

        int [][] arr1 = new int [n][m];
        int [][] arr2 = new int [m][n];

        for(int i=0; i<arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("before");

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++) {
                int temp = arr1[i][j];
                arr2[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("after");

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int getArrNumber(Scanner scanner, String str){
        int number = 0;
        System.out.println("Enter positive integer for " + str);
        while(true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                if (number < 0) {
                    System.out.println("Only positive number are allowed. Try again");
                    break;
                } else {
                    return number;
                }
            } else {
                System.out.println("Only number are allowed. Try again");
                scanner.nextLine();
            }
        }
        return number;
    }
}