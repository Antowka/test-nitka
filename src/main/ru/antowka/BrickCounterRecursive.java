package ru.antowka;

public class BrickCounterRecursive implements BrickCounter {

    @Override
    public double weight(int row, int pos) {

        if (row == 0) {
            return 0;
        }

        return getWeightWithPrevLevel(row, pos, 0, 0.5d);
    }



    private double getWeightWithPrevLevel(int row, int pos, double result, double step) {

        if (row == 0) return result; //exit



        if (isFirstOrLastBrickInRow(row, pos)) {
            if (pos != 0) pos--; //for only last block in row
            result += step;
            return getWeightWithPrevLevel(--row, pos, result, step / 2);
        }

        row--;
        double leftParentWeight = getWeightWithPrevLevel(row, pos - 1, result, step);
        double rightParentWeight = getWeightWithPrevLevel(row, pos, result, step);

        return (leftParentWeight + rightParentWeight + 2) / 2;
    }
}
