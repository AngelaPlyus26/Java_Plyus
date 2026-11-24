package DistanceCalculator;

// Расстояние по Муру

public class MooreDistance implements IDistanceCalculator {

    @Override
    public int calculate(Cell a, Cell b) {
        int dx = Math.abs(b.getX()-a.getX());
        int dY= Math.abs(b.getY()-a.getY());
        return Math.max(dx, dY);                  // возврат максимума
    }
}


