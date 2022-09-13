package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(long lowerLimit, long upperLimit) {
        int result =0;
        for(int i = 10; i < 100; i++) {
            long square = i * i;
            if ((square >= lowerLimit) & (square <= upperLimit)) {
                result++;
            }
        }
        return result;
    }
}
