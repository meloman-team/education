package ru.mt.lesson17;

public class Main2 {
    public static void main(String[] args) {
        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rubles = 14560.5;

        String currency = "EUR";
        System.out.println("Вы конвертируете рубли в " + currency);
        if (currency.equals("EUR")) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        }  else {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        }
    }
}