package ru.mirea.task6;

public class Student {
    public int[] id;

    public Student() {
        id = new int[7];
        int a = 0, b = 100;

        for (int i = 0; i < id.length; i++) {
            id[i] = (int) (a + (Math.random() * b));
        }
    }

    public void insertionSort() {
        for (int i = 0; i < id.length - 1; i++) {
            int min = id[i];
            int min_i = i;
            for (int j = i + 1; j < id.length; j++)
                if (id[j] < min) {
                    min = id[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = id[i];
                id[i] = id[min_i];
                id[min_i] = tmp;
            }
        }
    }

    public void printId() {
        for (int aIdNumber : id) {
            System.out.print(aIdNumber + " ");
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.insertionSort();
        student.printId();
    }
}
