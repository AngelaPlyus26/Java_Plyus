import java.util.Scanner;

public class ATM {
    public static void main() {
        int nom1=5000;
        int nom2=1000;
        int nom3=500;
        int nom4 =100;
        int kol1=3;
        int kol2=5;
        int kol3=10;
        int kol4=15;
        int x;
        int summa = inputX();
        printY(summa,nom1,nom2, nom4,nom4,kol1,kol2,kol3,kol4);
    }

    static int inputX() {
        System.out.println("Введите необходимую к выдаче сумму рублей:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x; //возвращение x
    }
    static void printY(int summa, int nom1, int nom2, int nom3, int nom4, int kol1, int kol2, int kol3, int kol4) {
              int totalSum=nom1*kol1+nom2*kol2+nom3*kol3+nom4*kol4; // всего денег в банкомате
              if (summa <= totalSum) {
                  int k1 = summa / nom1;
                  if (k1 > kol1) k1 = kol1;
                  summa = summa - k1 * nom1;
                  int k2 = summa / nom2;
                  if (k2 > kol2) k2 = kol2;
                  summa = summa - k2 * nom2;
                  int k3 = summa / nom3;
                  if (k3 > kol3) k3 = kol3;
                  summa = summa - k3 * nom3;
                  int k4 = summa / nom4;
                  if (k4 > kol4) k4 = kol4;
                  summa = summa - k4 * nom4;
                  int result=k1*nom1+k2*nom2+k3*nom3+k4*nom4;

                  System.out.println("К выдаче: "+result+" рублей");
                  System.out.println("Купюры: 5000: "+k1+"; 1000: "+k2+"; 500: "+k3+"; 100: "+k4);
              }
             else {
                  System.out.println("Операция не возможна - в банкомате недостаточно средств");
              }
     }
}



                                                                                 
