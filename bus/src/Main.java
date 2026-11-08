import java.util.Scanner;

public class Main {
    static void main() {
    System.out.println("Введите количество мостов: ");
    Scanner scanner = new Scanner(System.in);
    int kolvo = scanner.nextInt();
    // int height = 500;
    int i=0;
    boolean crashed=false;
    while (i < kolvo && !crashed)
    {
        i++;
        System.out.printf("Введите высоту моста №"+i+": ");
        int height = scanner.nextInt();
        if(height<=437) {
            System.out.printf("Crash "+i);
            crashed=true;
        }
    }
    if (!crashed)
        System.out.printf("No сrashed");
    }
}
