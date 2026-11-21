package Plyusnina_Calculator;

// Класс "Множитель" реализующий интерфейс

public class Multiplier implements Calculator {
    @Override
    public int calculate(int number1, int number2) {
        return number1 * number2;
    }
}
