import java.util.Scanner;

// 42
public class FortyTwo {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вводите числа, пока сумма не достигнет 42:");
        int sum = 0;
        int count = 0;
        int sumNegativ =0;
        int countNegativ = 0;
        float procentCountPozitiv;
        while (sum < 42) {
            int x = scan.nextInt();
            sum += x;
            count++;
            if (x<0) {
                sumNegativ += x;
                countNegativ++;
            }
        }
        procentCountPozitiv = (count-countNegativ)*100/count;
        System.out.println("Количество введенных чисел: "+count);
        System.out.println("Сумма отрицательных чисел: "+ sumNegativ);
        System.out.println("Процент количества положительных чисел: "+procentCountPozitiv);
    }
}


