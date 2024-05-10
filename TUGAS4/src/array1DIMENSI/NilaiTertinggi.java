/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1DIMENSI;

/**
 *
 * @author HP
 */
public class NilaiTertinggi {
    public static void main(String[] args) {
        // Mendefinisikan array
        int[] numbers = {5, 10, 3, 8, 15}; // Ubah nilai sesuai kebutuhan

        // Memanggil method untuk mencari nilai maksimum
        int max = findMax(numbers);

        // Menampilkan hasil
        System.out.println("Nilai maksimum: " + max);
    }

    // Method untuk mencari nilai maksimum dalam array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
