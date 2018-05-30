package ru.antowka;

public interface BrickCounter {

    double weight(int row, int pos);

    default boolean isFirstOrLastBrickInRow(int row, int pos) {
        return  (pos  == 0 || pos == row);
    }
}
