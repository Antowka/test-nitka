package ru.antowka;

public class BrickCounterRecursive implements BrickCounter {

    @Override
    public double weight(int row, int pos) {
        if (row == 0) {
            return 0;
        }
        return getWeight(row, pos);
    }


    private double getWeight(int row, int pos) {


        if (row == 0) {
            return 0;

        } else if (pos == 0 || pos == row) {
            double tempVal = 0d;
            for (int i = 1; i <= row; i++) {
                tempVal += Math.pow(0.5d, i);
            }
            return tempVal;
        } else {

            return (getWeight(row - 1, pos - 1) + getWeight(row - 1, pos) + 2) / 2;
        }
    }
}
