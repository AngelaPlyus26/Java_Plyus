package DistanceCalculator;
// Класс Клетка

public class Main {
    public static void main(String[] args) {

        // Задание Координат и параметров клеток
        Cell cell1 = new Cell(1, 4, "Розовый");
        Cell cell2 = new Cell(5, 2, "Сиреневый");

        System.out.println("---------------Параменры клеток-------------------");
        System.out.println("Клетка 1: "+cell1);
        System.out.println("Клетка 2: "+cell2);

        System.out.println("--------Результаты вычислений расстояния-----------");
        //Вызов метода ManhattanDistance - Манхэттенское расстояние
        ManhattanDistance manhattan = new  ManhattanDistance();
        System.out.println("Манхэттенское расстояние: "+ (int)manhattan.calculate(cell1,cell2));
        //Вызов метода CenterDistance - Расстояние между центрами клеток (Eвклидово)
        CenterDistance сenter = new  CenterDistance();
        System.out.println("Евклидово расстояние между центрами: "+ Math.round(сenter.calculate(cell1,cell2))); // округляется до ближайшего целого полученный результат

        //CornerDistance сorner = new CornerDistance();
        //System.out.println("Евклидово расстояние между углами: "+     );

        //MooreDistance Moore = new MooreDistance();
        //System.out.println("Расстояние по Муру: "+     );

    }
}


