import java.util.Scanner;

public class Conditioner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите troom - начальную температуру:  ");
        int troom = scanner.nextInt();
        System.out.println("Введите tcond - желаемую температуру:  ");
        int tcond = scanner.nextInt();
        System.out.println("Введите желаемый режим: freeze - охлаждение; heat - нагрев; auto - авто; fan - вентиляцию:");
        String mode = scanner.next();    // читаем слово в строковую переменную mode - вводится режим работы
        int result=troom;    //начальное значение температуры

        switch (mode) {
            case "freeze": result=Math.min(troom,tcond); //охладит до желаемой или остановится если температура ниже желаемой (минимум)
                break;
            case "heat": result=Math.max(troom,tcond);   //нагреет до желаемой или остановится если температура выше желаемой (максимум)
                break;
            case "auto": result=tcond;  //нагреет или охладит до желаемой (=tcond)
                break;
            case "fan": //режим вентиляции температура не меняется
                break;
        }
        System.out.println("Итоговая температура: "+result);
    };
}
