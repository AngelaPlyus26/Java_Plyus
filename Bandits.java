import java.util.Scanner;

public class Bandits {
static void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Введите количество выстрелов Гарри:");
    int shotGarry = scanner.nextInt();
    IO.println("Введите количество выстрелов Ларри:");
    int shotLarry = scanner.nextInt();
    int sumShot = shotGarry + shotLarry;
    IO.println("Всего попаданий в банки: "+sumShot);
    IO.println("Количество банок, которые стояли на бревне: "+(sumShot-1));
    //IO.println(sumShot-1);
    IO.println("Гарри не попал в "+(10-shotGarry)+" банок,"+" а Ларри не попал в "+(10-shotLarry)+" банки.");
    IO.println((10-shotGarry)+" "+(10-shotLarry));
    }
}
