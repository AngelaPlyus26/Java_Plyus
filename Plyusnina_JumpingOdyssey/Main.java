package Plyusnina_JumpingOdyssey;
// Прыгучее путешествие
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //  Файлы для ввода и вывода
        File inputFile = new File("INPUT.TXT");
        File outputFile = new File("OUTPUT.TXT");
        // Потоки ввода-вывода. Автоматическое закрытие после выхода из try
        try (Scanner sc = new Scanner(inputFile);
             PrintWriter out = new PrintWriter(outputFile)) {

            // Первая строка: N - количество точек, (xB, yB) - координаты лягушки (точка B), l - длина языка лягушки
            int n = sc.nextInt();
            int xB = sc.nextInt();
            int yB = sc.nextInt();
            int l = sc.nextInt();

            // Лягушка находится в точке B (xB, yB), кузнечик прыгает по точкам A (xA, yA)
            for (int i = 1; i <= n; i++) {
                int xA = sc.nextInt();
                int yA = sc.nextInt();
                int dx = xA - xB;
                int dy = yA - yB;
                System.out.println("i=" + i + ",  B: (" + xB + ", " + yB + ");  A (" + xA + ", " + yA + ");"); // на консоль
                // Сравниваем квадраты расстояний, чтобы обойтись без sqrt
                if (dx * dx + dy * dy <= l * l) {
                    out.println(i);  // вывод в файл значения i
                    System.out.println("Лягушка съела кузнечика на шаге: " + i); // вывод на консоль
                    return;
                }
            }
            out.println("Yes");
        }
    }
}
