package ru.mirea.task6;

public class SortingStudentsByGPA {
    public static void selectionSort (Comparable[] list, int low, int high) {
        Comparable temp;

        if (list.length == 0)
            return;
        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int supportingElement = (int) list[middle];

        int i = low, j = high;
        while (i <= j) {
            while (list[i].compareTo(supportingElement) < 0) { i++; }
            while (list[j].compareTo(supportingElement) > 0) { j--; }
            if (i <= j) {
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            selectionSort(list, low, j);
        if (high > i)
            selectionSort(list, i, high);
    }

    public static void main(String[] args) {
        Comparable[] list = new Comparable[]{5, 6, 3, 7, 2, 4, 1, 0};
        int low = 0;
        int high = list.length - 1;
        selectionSort(list, low, high);
        for (int i = list.length - 1; i >= 0; i--){
            System.out.print(list[i] + " ");
        }
    }
}
