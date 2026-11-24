package DistanceCalculator;

// 1. Расстояние между центрами клеток (Eвклидово)
// Если клетки хранятся индексами сетки (x, y), центр клетки находится в точке (x+0.5, y+0.5) при размере клетки 1.0

public class CenterDistance implements IDistanceCalculator {

    @Override
    public double calculate(Cell a, Cell b) {

    double dx = (a.getX() + 0.5) - (b.getX() + 0.5);
    double dy = (a.getY() + 0.5) - (b.getY() + 0.5);
    return  Math.hypot(dx, dy); // встроенная функция Math.hypot(dx, dy) вычисляет евклидово расстояние между точками (альтернатива Math.sqrt(dx * dx + dy * dy))
    }
}
