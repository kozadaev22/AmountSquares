package ru.netology.sqr.countSquare.service;

public class SQRService {
    public int calcSqr(int rangeA, int rangeB) {
        int counter = 0;
        for (int  i = 10; i <= 99; i = i + 1){
            int a = i * i;
            if (a <= rangeA){
                continue;
            }
            if (a >= rangeB){
                break;
            }
            counter = counter +1;
        }
        return counter;
    }
}
