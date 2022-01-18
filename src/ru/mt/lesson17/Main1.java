package ru.mt.lesson17;
// Исправьте программу так, чтобы рекомендация по покупке долларов печаталась, только если курс меньше 70. Не забудьте проверить, что всё работает — поменяйте значение курса и убедитесь, что программа может дать вам совет.
public class Main1 {
    public static void main(String[] args) {

    double rateUSD = 78.5;
    double rubles = 14356.5;

        ...
    System.out.println("Отличный курс доллара — рекомендую купить!");
        ...

    System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
}
}
}
