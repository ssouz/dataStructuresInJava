package org.ssouz.sortingAlgorithms.bubbleSort;

public class bubbleSort {
    public static void main(String[] args) {
      
       
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
       

        System.out.println("Array original:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        


        bubbleSort(arr);

        System.out.println("\nArray após a ordenação:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    
    }
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
