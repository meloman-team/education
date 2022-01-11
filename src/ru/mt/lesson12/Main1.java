package ru.mt.lesson12;

public class Main1 {
    public static void main(String[] args){
        double rubles = 15000.0;
        double rateUSD = 78.5;
        double dollars = rubles/rateUSD;
        System.out.println("С текущим курсом вы можете купить" + " " + dollars + " " + "долларов ");
    }
}
