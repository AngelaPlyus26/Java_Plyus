package Plyusnina_Calculator;

// Класс "Вычитатель"

public class Subtractor implements Calculator {

    @Override
    public int calculate(int number1, int number2) {
        return number1 - number2;
    }
}
