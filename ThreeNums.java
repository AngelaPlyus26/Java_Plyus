public class ThreeNums {
    static void main() {
        IO.println("Введите три целых числа:");
        //Чтение чисел с помощью пакета IO:
        int a = Integer.parseInt(IO.readln()); //readln() возвращает строку, которую мы передаем в метод parseInt
                                               //parseInt интерпретирует строку как число
                                               //Scaner в этом случае будет удобнее
        int b = Integer.parseInt(IO.readln());
        int c = Integer.parseInt(IO.readln());

        // IO.println("(a-b) = "+(a-b));
        System.out.println("(a-b) = " + (a-b));   //so выбрать внизу soutv
        System.out.println("(b-a) = " + (b-a));
        System.out.println("(b-c) = " + (b-c));
        System.out.println("(c-b) = " + (c-b));
        System.out.println("(a-c) = " + (a-c));
        System.out.println("(c-a) = " + (c-a));



    }
    // вне тела метода нельзя сделать вывод информации (проверять закрывающие скобки)
}
