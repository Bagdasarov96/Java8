package ru.netology.sqr.tesqa;

public class SQRService {
    public int calculationOfSqr(int from, int to) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int Square = i * i;
            if (Square >= from) {
                if (Square <= to) {
                    counter++;
                }
            }

        }
        return counter;
    }
}
