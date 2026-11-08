import java.util.Scanner;

// Цветочки
public class Flowers {
    static void main() {
        IO.println("Введите число дней: ");
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        String answer = "GSV" ;

        int remainder = k % 3; //остаток от деления (з дня - повторение цикла)

        if (remainder == 0) {
            answer = "GSV";
        } else
            if (remainder == 1) {
            answer = "VGC";
            } else
                answer = "CVG";

        IO.println("Ответ: "+answer);
    }
}


