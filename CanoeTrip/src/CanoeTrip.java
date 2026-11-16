import java.util.Arrays;
import java.util.Scanner;

public class CanoeTrip {  //--------------------------Байдарочный поход----------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N - количество человек: ");
        int N = scanner.nextInt();
        System.out.println("Введите D - грузоподъемность 1 байдарки: ");
        int D = scanner.nextInt();
        int[] weight = inputWeights(N);   // получаем введенный массив масс из Метода
        System.out.println("Введенный массив масс людей: " + Arrays.toString(weight)); // исп-ся метод преобразования массива в строку для вывода
        int result = countСanoe(weight, D); // получаем вычисленное необходимое количество байдарок из Метода
        System.out.println("Минимальное количество байдарок: "+result);
    }

    static int[] inputWeights(int n) { // --------Ввод элементов массива---------
        Scanner scanner = new Scanner(System.in);
        int[] weight = new int[n]; // объявление массива весов людей
        System.out.println("Введите вес " + n + " человек: ");
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }
        return weight; // возврат результата - массива масс
    }

    static int countСanoe(int[] weight, int d) { // функция подсчета необходимых байдарок параметры - массив масс и грузоподъемность байдарки
        // int[] w= weight.clone(); // создание копии исходного массива
        // -------------cортировка массива масс-------------------------------------------------------
        Arrays.sort(weight); // сортировка массива
        // -------------подсчет необходимого количества байдарок--------------------------------------
        int left = 0; // индекс самого левого элемента массива
        int right = weight.length - 1; // индекс самого правого (длина массива минус 1, т.к. нумерация с 0)
        int canoes = 0;
        while (left <= right) {                          // Сравнение индексов.
            if (weight[left] + weight[right] <= d) {     // Сравнение масс.
                left++;  // сумма масс не превышает грузоподъемность, тогда с левой стороны переход на следующий индекс
            }
            right--;    //сумма масс превысила грузоподъемность, тогда с правой стороны переход на следующий индекс
            canoes++;    //количество байдарок увеличилось на 1
        }
        return canoes; // если индексы пересеклись, то возврат результата - подсчитанного значения
    }
}
