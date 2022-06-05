package ru.netology.sqr.countSquare.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/parameter.txt.csv")
    public void testAmountSquaresInRange(int expected, int rangeA, int rangeB) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(rangeA, rangeB);
        Assertions.assertEquals(expected, actual);
    }

}
