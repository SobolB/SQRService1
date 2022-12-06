package ru.netology.sqr;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calcul(200, 300);
        int expected = 3;


        AssertJUnit Assertions = null;
        Assertions.assertEquals(expected, actual);
    }
}
