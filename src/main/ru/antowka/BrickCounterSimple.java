package ru.antowka;

public class BrickCounterSimple implements BrickCounter {

    private static final double BRICK_WEIGHT = 1d;

    public static void main(String[] args) {
    }


    @Override
    public double weight(int row, int pos) {

        if (row == 0) {
            return 0;
        }

        int amountBricksInCurrentRow = amountOfBricksInRow(row);
        int bricksInUpperRows = amountBricksInUpperRows(row, amountBricksInCurrentRow);
        double pressureForFirstAndLastBrickInRow = getPressureForFirstAndLastBrickInRow(row);
        double resultWeight = (bricksInUpperRows * BRICK_WEIGHT - pressureForFirstAndLastBrickInRow * 2) /
                (amountBricksInCurrentRow - 2);

        return isFirstOrLastBrickInRow(row, pos) ? pressureForFirstAndLastBrickInRow : resultWeight;
    }

    private int amountOfBricksInRow(int row) {
        return row + 1;
    }

    private int amountBricksInUpperRows(int currentRow, int amountBricksInCurrentRow) {
        int result = 0;

        for (;currentRow > 0; currentRow--) {
            result += --amountBricksInCurrentRow;
        }

        return result;
    }

    private double getPressureForFirstAndLastBrickInRow(int row) {
        double result = 0d;
        for (double step = 0.5d; row > 0; row--, step /= 2) {
            result += step;
        }
        return result;
    }
}
