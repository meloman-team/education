package ru.mt.lesson15;

class Praktikum {
    public static void main(String[] args) {
        double rubles = 30000.0;
        double rateUSD = 78.5;
        double dollars = rubles/rateUSD;
        System.out.println("У Вас на счету" + " " + rubles + " " + "рублей." + " " + "В долларах это" + " " + dollars + " " + "долларов." + " " + "Так держать!" );
    }
}