package ru.mirea.task5;

public class Recursion6 {
    public static String rec_prime_check(int n, int i) {
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return rec_prime_check(n, i + 1);
        }
        else {
            return "YES";
        }
    }
}
