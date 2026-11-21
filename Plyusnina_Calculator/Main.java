package Plyusnina_Calculator;

import java.util.Scanner;

public class Main {                                //   Основной класс
    public static void main(String[] args) {

        // Ввод с консоли двух целых чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Этот калькулятор умеет суммировать, вычитать, умножать и делить целые числа: ");
        System.out.println("Введите первое целое число: ");
        int number1 =scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 =scanner.nextInt();

        // Создание объектов
        Adder adder = new Adder();
        Subtractor subtractor = new Subtractor();
        Multiplier multiplier = new Multiplier();
        Divider divider = new Divider();

        // Вывод результатов сложения, вычитания, умножения
        System.out.println("Результат сложения: "+adder.calculate(number1,number2));
        System.out.println("Результат вычитания: "+subtractor.calculate(number1, number2));
        System.out.println("Результат умножения: "+multiplier.calculate(number1, number2));

        // Вывод результата деления
        if (number2==0)
            System.out.println("Деление: Ошибка - деление на ноль невозможно");
               else
               System.out.println("Результат деления: "+divider.calculate(number1, number2));
    }
}
