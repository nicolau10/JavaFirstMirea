package ru.mirea.task5;

public class Recursion7 {
    public static void rec_factorization(int n, int i) {
        if (i > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
            rec_factorization(n / i, i);
        }
        else {
            rec_factorization(n, ++i);
        }
    }
}
