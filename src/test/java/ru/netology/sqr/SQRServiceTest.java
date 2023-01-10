package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class SQRServiceTest {

    @Test
    public void calculateTest() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}

