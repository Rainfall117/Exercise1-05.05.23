package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RestCalcServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })

    public void restTest(int income, int expenses, int threshold, int expected) {
        RestCalcService rest = new RestCalcService();

        int actual = rest.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

/* class RestCalcServiceTest1 {
    @Test
    public void restTest() {
        RestCalcService rest = new RestCalcService();

        int actual = rest.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
 */