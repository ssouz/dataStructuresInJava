package org.ssouz.sortingAlgorithms.selectionSort;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        System.out.println("antes do selection sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        selectionSort(arr);

        System.out.println("\ndepois do selection sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

        

    }
    public static void selectionSort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
}
