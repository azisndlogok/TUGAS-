/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class duaarraymenjadi1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int[] mergedArray = merge(array1, array2);
        
        // Menampilkan array pertama
        System.out.print("Array pertama: ");
        printArray(array1);
        
        // Menampilkan array kedua
        System.out.print("Array kedua: ");
        printArray(array2);
        
        // Menampilkan array gabungan
        System.out.print("Array gabungan: ");
        printArray(mergedArray);
    }
    
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        
        // Copy elements from array1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        
        // Copy elements from array2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        
        return merged;
    }
    
    // Method untuk mencetak isi dari array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
