,./*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class arraynamaorang {
    public static void main(String[] args) {
        String[] names = {"Upin", "Ipin", "Jarjit", "Ehsan", "Fizi", "Memey", "Susanti"};

        System.out.println("Array sebelum pengurutan:");
        printArray(names);

        // Pengurutan menggunakan Insertion Sort
        String[] sortedNamesInsertionSort = insertionSort(names.clone());
        System.out.println("\nArray setelah pengurutan menggunakan Insertion Sort:");
        printArray(sortedNamesInsertionSort);

        // Pengurutan menggunakan Selection Sort
        String[] sortedNamesSelectionSort = selectionSort(names.clone());
        System.out.println("\nArray setelah pengurutan menggunakan Selection Sort:");
        printArray(sortedNamesSelectionSort);

        // Pengurutan menggunakan Bubble Sort
        String[] sortedNamesBubbleSort = bubbleSort(names.clone());
        System.out.println("\nArray setelah pengurutan menggunakan Bubble Sort:");
        printArray(sortedNamesBubbleSort);
    }

    // Insertion Sort
    public static String[] insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    // Selection Sort
    public static String[] selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // Bubble Sort
    public static String[] bubbleSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
