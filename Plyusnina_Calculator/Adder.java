package Plyusnina_Calculator;

// Класс "Cумматор" реализующий интерфейс

public class Adder implements Calculator {
    @Override
    public int calculate(int number1, int number2) {
        return number1+number2;
    }
}
