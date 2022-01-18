package ru.mt.lesson17;

public class Main1 {
    public static void main(String[] args) {
        double rateUSD = 68.5;
        double rubles = 14356.5;
        if (rateUSD >= 70) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else {
            System.out.println("Отличный курс доллара — рекомендую купить!");
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        }
    }
}

