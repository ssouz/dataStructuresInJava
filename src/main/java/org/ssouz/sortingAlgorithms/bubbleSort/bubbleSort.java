package org.ssouz.sortingAlgorithms.bubbleSort;


import  org.ssouz.execTime;

public class bubbleSort {
    public static void main(String[] args) {
      
        execTime.starter();
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
       

        System.out.println("Array original:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        execTime.finish();
        execTime.starter();


        bubbleSort(arr);

        System.out.println("\nArray após a ordenação:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        execTime.finish();
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

    }


}
