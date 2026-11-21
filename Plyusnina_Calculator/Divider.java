package Plyusnina_Calculator;

// Класс "Делитель" реализующий интерфейс

public class Divider implements Calculator {
    @Override
    public int calculate(int number1, int number2) {
        if(number2==0) {
            System.out.println("Ошибка: деление на ноль.");
            return 0;
        }
        return number1/number2;
    }
}
