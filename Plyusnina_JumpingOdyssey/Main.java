package Plyusnina_JumpingOdyssey;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Прыгучее путешествие
// Расстояние на длину языка
public class Main {
public static void main(String[] args) throws FileNotFoundException {

    // Указание файлов для ввода и вывода
    File inputFile = new File("INPUT.TXT");
    File outputFile = new File("OUTPUT.TXT");

    // Объявление сканера для работы с файлами
    Scanner sc = new Scanner(inputFile);
    PrintWriter out = new PrintWriter(outputFile);

    // Чтение из файла первой строки
    int n  = sc.nextInt(); // Количество прыжков кузнечика N=3
       long xB = sc.nextLong(); // Начальная координата лягушки в точке В x=0. Формат - длинное целое.
       long yB = sc.nextLong(); // Начальная координата лягушки в точке В y=0. Формат - длинное целое.
       long l  = sc.nextLong(); // Длина языка лягушки l=1. Формат - длинное целое.
    // Координаты лягушки по условию задачи - точка В (хВ=0; уB=0). Координаты кузнечика в точках A (х,у)
    // логическая переменная (если не съела кузнечика вывести false)
    boolean isEaten = false;   // начальное значение

    for (int i = 1; i <=n; i++) {
        long xA = sc.nextLong(); // чтение следующей строки файла - координаты xA точки A куда прыгнул кузнечик
        long yA = sc.nextLong(); // чтение следующей строки файла - координаты yA точки A куда прыгнул кузнечик
        long dx = xA - xB; // расстояние по оси x между кузнечиком и лягушкой
        long dy = yA - yB; // расстояние по оси у между кузнечиком и лягушкой
        if ((dx*dx+dy*dy<=l*l)&&!isEaten) {
            out.println(i);  // вывод в файл
            isEaten=true;
            System.out.println("Лягушка съела кузнечика на шаге: "+i); // вывод на консоль
            break;
        }
    }
    if (!isEaten==true) out.println("Yes");

    // проверка
    System.out.println("КУЗНЕЧИК: количество прыжков N= "+n);
    System.out.println("ЛЯГУШКА: длина языка L= "+l+ "; координаты точки В (x="+xB+",y="+yB+")"+" Лягушка съела кузнечика: "+isEaten);
    System.out.println("Лягушка съела кузнечика? isEaten: "+isEaten);

    sc.close();
    out.close();
}
}
