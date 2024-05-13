/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class menghitungjumlah {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};
        countOccurrences(array);
    }

    public static void countOccurrences(int[] array) {
        // Mendefinisikan array untuk menyimpan jumlah kemunculan setiap elemen
        int[] occurrences = new int[101]; // Ukuran array disesuaikan dengan rentang elemen (0-100)

        // Memproses setiap elemen dalam array dan meningkatkan jumlah kemunculan di indeks yang sesuai
        for (int element : array) {
            occurrences[element]++;
        }

        // Mencetak jumlah kemunculan setiap elemen yang muncul lebih dari 0 kali
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println("Elemen " + i + " muncul " + occurrences[i] + " kali.");
            }
        }
    }
}