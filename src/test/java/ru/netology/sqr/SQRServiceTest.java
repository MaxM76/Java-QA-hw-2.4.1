package ru.netology.sqr;
import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalcForBothLimitsMuchLessThanMinOfLiableRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 64;
        long uLevel = 81;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitMuchLessULimitLessAndNearThanLiableMin
            () {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 81;
        long uLevel = 99;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitLessAndNearULimitExactOnLiableMin() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 99;
        long uLevel = 100;
        int expected = 1;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitExactOnULimitHighAndNearOfLiableMin() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 100;
        long uLevel = 101;
        int expected = 1;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitHighAndNearOfLiableMinULimitLessAndNearOfLiableMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 101;
        long uLevel = 9800;
        int expected = 88;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitLessAndNearULimitExactOnLiableMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 9800;
        long uLevel = 9801;
        int expected = 1;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitExactOnULimitHighAndNearOfLiableMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 9801;
        long uLevel = 9802;
        int expected = 1;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitHighAndNearULimitMuchHigherThanLiableMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 9802;
        long uLevel = 10000;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForBothLimitsMuchHigherThanMaxOfLiableRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 10000;
        long uLevel = 10201;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForBothLimitsExactOnLiableRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 100;
        long uLevel = 9801;
        int expected = 90;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitExactOnLiableMinULimitWithinLiableRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 100;
        long uLevel = 2401;
        int expected = 40;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitWithinLiableRangeULimitExactOnLiableMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 2401;
        long uLevel = 9801;
        int expected = 51;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitWithinLiableRangeULimitExactOnLiableMin() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 2401;
        long uLevel = 100;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcForLLimitExactOnLiableMaxULimitWithinLiableRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long lLevel = 9801;
        long uLevel = 2401;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.numberOfSquares(lLevel, uLevel);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}
