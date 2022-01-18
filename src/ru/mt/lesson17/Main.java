package ru.mt.lesson17;
// Исправьте проблему с областью видимости переменной rateUSD. Объявите её после переменной condition и там же инициализируйте — присвойте значение 78.8.
public class Main  {
    public static void main(String[] args) {

        boolean condition = true;
        // Перенесите объявление переменной сюда

        if (condition) {
            double rateUSD = 78.8;
            System.out.println("Внутри блока курс доллара виден. Он равен " + rateUSD);
        }
        // Здесь переменная rateUSD не видна
        System.out.println("Вне блока курс доллара не виден. Должен быть " + rateUSD);
    }
}

