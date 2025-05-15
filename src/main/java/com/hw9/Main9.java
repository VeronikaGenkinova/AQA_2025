package main.java.com.hw9;


public class Main9 {
    public static void main (String[] args){
//
//        Є дві команди регбі з 25 гравців різного віку у кожній
//        Вік беремо випадковим чином в діапазоні від 18 до 40
//        Виведіть у двох рядках вік гравців кожної команди
//        Порахуйте середній вік гравців кожної команди та виведіть на екран


        int [] regbyTeam1 = new int [25];
        int [] regbyTeam2 = new int [25];

        int minAge = 18;
        int maxAge = 40;

        for (int i = 0; i<regbyTeam1.length; i++){
            regbyTeam1[i] = ((int)(Math.random() * (maxAge-minAge+1)) + minAge);
        }

        for (int j = 0; j<regbyTeam1.length; j++){
            if(regbyTeam1.length- 1 == j){
                System.out.print(regbyTeam1[j]);
            } else {
                System.out.print(regbyTeam1[j] +", ");
            }
        }
        System.out.println();

        for (int i = 0; i<regbyTeam2.length; i++){
            regbyTeam2[i] = ((int)(Math.random() * (maxAge-minAge+1)) + minAge);
        }

        for (int j = 0; j<regbyTeam2.length; j++){
            if(regbyTeam2.length- 1 == j){
                System.out.print(regbyTeam2[j]);
            } else {
                System.out.print(regbyTeam2[j] +", ");
            }
        }
        System.out.println();

        int sumAgeTeam1 = 0;
        for (int age : regbyTeam1) {
            sumAgeTeam1 += age;
        }
        double avgAgeTeam1 = (double) sumAgeTeam1/regbyTeam1.length;
        System.out.println("середній вік гравців 1 команди: " + avgAgeTeam1);

        int sumAgeTeam2 = 0;
        for (int age : regbyTeam2) {
            sumAgeTeam2 += age;
        }
        double avgAgeTeam2 = (double) sumAgeTeam2/regbyTeam2.length;
        System.out.println("середній вік гравців 2 команди: " + avgAgeTeam2);
    }
}
