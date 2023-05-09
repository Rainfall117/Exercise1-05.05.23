
package ru.netology.service;

public class RestCalcService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                count++;
                money -= expenses;
                money /= 3;

            } else {
                money += (income - expenses);
            }
        }
        return count;
    }
}
