package DistanceCalculator;

// Манхэттенское расстояние

public class ManhattanDistance implements IDistanceCalculator {

    @Override
    public int calculate(Cell a, Cell b) {
        int dx = Math.abs(b.getX()-a.getX());
        int dY= Math.abs(b.getY()-a.getY());
        return dx+dY;
    }
}
