package DistanceCalculator;

// 1. Евклидово расстояние между центрами

public class CenterDistance implements IDistanceCalculator {

    @Override
    public int calculate(Cell a, Cell b) {

    double dx =  b.getX() - a.getX();
    double dy =  b.getY() - a.getY();
    double distance =  Math.sqrt(dx * dx + dy * dy);
    return (int) Math.round(distance);   //   округление до большего, приведение к формату int
    }
}
