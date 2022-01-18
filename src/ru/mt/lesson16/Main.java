package ru.mt.lesson16;
// В приложении хранятся курсы доллара и евро. Ваш друг утверждает, что стоимость доллара выше или совпадает со стоимостью евро. Докажите ему, что это ложь! Сохраните результат сравнения в переменную с именем isMoreOrEqual. Напечатайте значение этой переменной.
class Praktikum {
    public static void main(String[] args) {
        double rateUSD = 78.5;
        double rateEUR = 85.5;
        boolean isMoreOrEqual = rateUSD > rateEUR;
        System.out.println( isMoreOrEqual );
    }
}


