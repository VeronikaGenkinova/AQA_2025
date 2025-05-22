package main.java.com.hw11;

public class Main11 {

    public static void main(String[] args){
        personInfo("Will", "Smith", "New York",  "2936729462846");
        personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock", "Holmes", "London", "37742123513");

    }
    public static String personInfo(String name, String surename, String city, String number){
        String personInfo = ("Зателефонувати громадянину" + name + surename + "із міста" + city + "можна за номером" + number);
        System.out.println(personInfo);
        return personInfo;
    }
}
