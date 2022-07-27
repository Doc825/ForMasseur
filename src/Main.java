

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expenses, rent, salary, others, overall_check, consumers_per_week, income, total_income, total_expenses, adv, taxes;
        System.out.println("Добро пожаловать! Данный алгоритм позволит вам определить рентабельность массажного кабинета,");
        System.out.println("разумеется,  приблизительную. Следуйте инструкциям и наслаждайтесь результатом.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Какова стоимость арендной платы? " );
        rent = sc.nextInt();

        System.out.println("Если будут наняты дополнительно сотрудники, какая сумма будет направлена на оплату труда? ");
        System.out.println("Если найм не планируется, нажмите ноль. ");
        salary = sc.nextInt();

        System.out.println("Сумма неучтенных расходов(например комм платежи, расходные материалы)?");
        others = sc.nextInt();

        System.out.println("Введите сумму ежемесячных затрат на рекламу ");
        adv = sc.nextInt();

        System.out.println("Сколько клиентов в неделю должен принимать кабинет? ");
        consumers_per_week = sc.nextInt();

        System.out.println("Ожидаемое количество клиентов в месяц: " + consumers_per_week * 4 + " человек(а).");

        System.out.println("Введите сумму планируемого среднего чека (рекомендуемый диапазон 800 - 1500 рублей");
        overall_check = sc.nextInt();

        total_income = (consumers_per_week * 4) * overall_check;
        System.out.println("Средний доход в месяц до вычета расходов составит " + total_income + " рублей.");
        System.out.println();


        expenses = rent + salary + others + adv;
        System.out.println("Расходов за месяц без учета налогов: " + expenses + " рублей.");
        System.out.println();

        taxes = (total_income - expenses) / 100 * 7;
        System.out.println("Налог за месяц при упрощенной системе налогообложения составит " + taxes + " рублей.");
        System.out.println();

        total_expenses = expenses + taxes;
        System.out.println("Итого расходов: " + total_expenses + " рублей.");

        income = total_income - expenses;
        System.out.println("Чистая прибыль в месяц составит приблизительно " + income + " рублей.");



    }
}


