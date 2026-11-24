package DistanceCalculator;

// Манхэттенское расстояние

public class ManhattanDistance implements IDistanceCalculator {

    @Override
    public double calculate(Cell a, Cell b) {
        int dx = Math.abs(a.getX()-b.getX());
        int dY= Math.abs(a.getY()-b.getY());
        return dx+dY;
    }
}
