package Plyusnina_Calculator;

// Класс "Умножитель"

public class Multiplier implements Calculator {

    @Override
    public int calculate(int number1, int number2) {
        return number1 * number2;
    }
}
