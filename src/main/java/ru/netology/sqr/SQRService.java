package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowLimit, int highLimit) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            int cvadr = i * i;
            if (cvadr >= lowLimit) {
                if (cvadr <= highLimit) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
