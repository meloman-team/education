package ru.mt.lesson17;

public class Main  {
    public static void main(String[] args) {

        boolean condition = true;
        double rateUSD = 78.8;
        System.out.println("Внутри блока курс доллара виден. Он равен " + rateUSD);
        if (condition);
        System.out.println("Вне блока курс доллара не виден. Должен быть " + rateUSD);
        }


    }


