package main.java.com.hw5;

public class Main {

    public static void main(String[] args) {

        int dinastyLee = 860;
        double dinastyMin = 860 * 1.5;

        int voinLee = 13;
        int luchnikLee = 24;
        int vershnikLee = 46;
        int voinMin = 9;
        int luchnikMin = 35;
        int vershnikMin = 12;

        int pokaznikAtakiLee = (voinLee + luchnikLee + vershnikLee) * dinastyLee;
        int pokaznikAtakiMin = (voinMin + luchnikMin + vershnikMin) * (int)dinastyMin;

        System.out.println("Загальний показник атаки воїнів династії Лі: " + pokaznikAtakiLee);
        System.out.println("Загальний показник атаки воїнів династії Минь: " + pokaznikAtakiMin);





    }
}
