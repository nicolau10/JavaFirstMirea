package ru.mirea.task5;

public class Recursion5 {
    public static int rec_digit_sum(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + rec_digit_sum(n / 10);
        }
    }
}
