package ru.mt.lesson18;

public class Main2 {
    public static void main(String[] args) {

        double rubles = 14560.5;
        double rateUSD = 78.5;
        double rateEUR = 85.5;
        double rateJPY = 0.74; // Курс японской иены

        String currency = "DKK";
        System.out.println("Вы конвертируете рубли в " + currency);

        if (currency.equals("USD")) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency.equals("EUR")) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } ... {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } ... {
            System.out.println("Валюта не поддерживается.");
        }
    }
}


