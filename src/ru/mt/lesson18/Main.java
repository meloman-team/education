package ru.mt.lesson18;

public class Main {
    public static void main(String[] args) {

        double moneyBeforeSalary = 5000.0;{

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            System.out.println("Окей, пора в Макдак!");
        } else {
            System.out.println("Класс! Заказывайте крабов!");
        }
    }
}
}
