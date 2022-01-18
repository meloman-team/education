package ru.mt.lesson15;

//Теперь нужно сообщить пользователю о его финансовом положении. После подсчета долларов напечатайте следующую строку: «У вас на счету ... рублей. В долларах это ... долларов. Так держать!».
class Praktikum {
    public static void main(String[] args) {
        double rubles = 30000.0;
        double rateUSD = 78.5;
        double dollars = rubles/rateUSD;
    }
}