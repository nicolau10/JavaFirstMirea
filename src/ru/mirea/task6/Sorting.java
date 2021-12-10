package ru.mirea.task6;

import java.util.Arrays;

public class Sorting {
    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) return;
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        // Создание временных подмассивов
        int tempLeft[] = new int[mid - low + 1];
        int tempRight[] = new int[high - mid];

        for (int i = 0; i < tempLeft.length; i++)
            tempLeft[i] = array[low + i];
        for (int i = 0; i < tempRight.length; i++)
            tempRight[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {
            if (leftIndex < tempLeft.length && rightIndex < tempRight.length) {
                if (tempLeft[leftIndex] < tempRight[rightIndex]) {
                    array[i] = tempLeft[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = tempRight[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < tempLeft.length) {
                array[i] = tempLeft[leftIndex];
                leftIndex++;
            } else if (rightIndex < tempRight.length) {
                array[i] = tempRight[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{5, 6, 7, 2, 4, 1, 7};
        int[] array2 = new int[]{12, 3, 0, 2, 21, 30, 9};
        int [] array = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++){
            array[i] = array1[i];
            count++;
        }
        for (int i : array2) {
            array[count++] = i;
        }
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
