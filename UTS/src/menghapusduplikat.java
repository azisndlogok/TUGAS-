/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class menghapusduplikat {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(array);
        
        // Menampilkan array setelah menghapus duplikat
        System.out.print("Array setelah menghapus duplikat: ");
        printArray(result);
    }

    public static int[] removeDuplicates(int[] array) {
        // Membuat array untuk menyimpan jumlah kemunculan setiap elemen
        int[] occurrences = new int[101]; // Ukuran array disesuaikan dengan rentang elemen (0-100)

        // Menghitung jumlah kemunculan setiap elemen dalam array
        for (int element : array) {
            occurrences[element]++;
        }

        // Menghitung jumlah elemen unik dalam array
        int uniqueCount = 0;
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                uniqueCount++;
            }
        }

        // Membuat array baru untuk menyimpan elemen unik
        int[] result = new int[uniqueCount];
        int j = 0;

        // Memasukkan elemen unik ke dalam array baru
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                result[j++] = i;
            }
        }

        return result;
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