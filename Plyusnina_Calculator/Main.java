package Plyusnina_Calculator;

import java.util.Scanner;

public class Main {                                //   Основной класс
    public static void main(String[] args) {

        // Ввод пользователем с консоли двух целых чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Этот калькулятор умеет суммировать, вычитать, умножать и делить целые числа: ");
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        // Создание массива из разных реализаций интерфейса
        Calculator[] operations = {new Adder(), new Subtractor(), new Multiplier(), new Divider()};
        String[] names = {"Сложение", "Вычитание", "Умножение", "Деление"};

        // Вывод результатов сложения, вычитания, умножения
        System.out.println("Результаты арифметических операций. ");
        for (int i = 0; i < operations.length; i++) {
            if (i == 3 && number2 == 0) {
                System.out.println("Ошибка - деление на ноль невозможно! ");
                continue;   // пропуск шага
            }
            int result = operations[i].calculate(number1, number2);
            System.out.println(names[i] + ": " + result);
        }
    }
}


