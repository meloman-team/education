package ru.mt.lesson19;

public class Main {
    public static void main(String[] args) {

        double moneyBeforeSalary = 15000.0; // Количество денег до зарплаты
        int daysBeforeSalary = 14;

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            // Здесь нужное условие уже добавили
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }

        } else if (moneyBeforeSalary < 30000) {
            // Допишите условие
            ... {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            } ... {
                System.out.println("Окей, пора в Макдак!");
            }

        } else {
            // Если до зарплаты меньше 10 дней, то едим крабов
            ...
            System.out.println("Класс! Заказывайте крабов!");
            // Иначе — доллары и ужин в хорошем ресторане
            ...
            System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");

        }
    }
}
}
