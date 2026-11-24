package DistanceCalculator;

public class Main {
    public static void main(String[] args) {

        // Задание Координат и параметров клеток
        Cell cell1 = new Cell(1, 4, "Розовый");
        Cell cell2 = new Cell(5, 2, "Сиреневый");

        System.out.println("----------Вывод параметров клеток------------------");
        System.out.println("Клетка 1: "+cell1);
        System.out.println("Клетка 2: "+cell2);

        System.out.println("--------Результаты вычислений расстояния-----------");

        IDistanceCalculator manhattan = new  ManhattanDistance();
        System.out.println("Манхэттенское расстояние: "+ manhattan.calculate(cell1,cell2));

        IDistanceCalculator сenter = new  CenterDistance();
        System.out.println("Евклидово расстояние между центрами: "+ сenter.calculate(cell1,cell2));

        IDistanceCalculator  moore = new MooreDistance();
        System.out.println("Расстояние по Муру: "+moore.calculate(cell1,cell2));

        //IDistanceCalculator сorner = new CornerDistance();
        //System.out.println("Евклидово расстояние между углами: "+сorner.calculate(cell1,cell2));

    }
}


