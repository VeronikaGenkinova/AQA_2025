package main.java.com.hw6;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){


        int teamMembersCount = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ім'я першої команди");
        String teamName1 = scanner.nextLine();
        System.out.println();
        System.out.println("Введіть кількість фрагів для гравців першої команди " + teamName1);
        System.out.println();

        int teamScoreSum = 0;
        for(int i=1; i<=5; i++) {
            if (scanner.hasNextInt()) {
                int teamMember = scanner.nextInt();
                scanner.nextLine();
                teamScoreSum = teamScoreSum + teamMember;

            } else {
                System.out.println("Невірне значення кількості фрагів");
                System.exit(0);
            }
        }
        double avgTeam1 = (double) (teamScoreSum)/teamMembersCount;
        System.out.println(avgTeam1);
        System.out.println();
        System.out.println("Введіть ім'я другої команди");
        String teamName2 = scanner.nextLine();
        System.out.println();
        System.out.println("Введіть кількість фрагів для гравців другої команди" + teamName2);

        int team2ScoreSum = 0;
        for(int i=1; i<=5; i++){
            if (scanner.hasNext()){
                int team2Member = scanner.nextInt();
                scanner.nextLine();
                team2ScoreSum = team2ScoreSum + team2Member;
            } else {
                System.out.println("Невірне значення кількості фрагів");
                System.exit(0);
            }
        }
        double avgTeam2 = (double) (team2ScoreSum)/teamMembersCount;
        System.out.println(avgTeam2);
        System.out.println();
        if(avgTeam1>avgTeam2){
            System.out.println("Перемогла команда " + teamName1 + " набрала " + avgTeam1 + " очків");
        } else if (avgTeam1<avgTeam2){
            System.out.println("Перемогла команда " + teamName2 + " набрала " + avgTeam2 + " очків");
        } else {
            System.out.println("Рахунок рівний");
        }
    }
}
