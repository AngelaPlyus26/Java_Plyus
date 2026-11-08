import java.util.Scanner;
// Чашка кофе
public class Coffee {
    static void main() {

    Scanner scan = new Scanner(System.in);
    IO.println("Сколько стоит чашка кофе?");
    int x = scan.nextInt();

    if (x>300) {
        IO.println("Дороговато");
    }
    else
        if (x>=150) {
          IO.println("Норм");
        }
        else
            if (x>=80) {
            IO.println("Дешево");
            }
            else
                IO.println("А это в рублях? A это вообще кофе?");
        }
}

