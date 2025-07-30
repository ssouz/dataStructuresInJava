package org.ssouz.sortingAlgorithms.insertSort;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        System.out.println("antes do insert sort");

        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+ ", ");
        }
        insertionSort(arr);

        System.out.println("\ndepois do insert sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

    }
    public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
}
