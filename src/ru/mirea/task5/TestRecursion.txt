package ru.mirea.task5;

public class TestRecursion {
    public static void main(String[] args) {
        System.out.println("Task 5");
        System.out.println(Recursion5.rec_digit_sum(222));

        System.out.println("Task 6");
        System.out.println(Recursion6.rec_prime_check(5, 2));

        System.out.println("Task 7");
        Recursion7.rec_factorization(32, 2);

        System.out.println("Task 8");
        System.out.println(Recursion8.rec_palindrome("rotator"));
    }
}
