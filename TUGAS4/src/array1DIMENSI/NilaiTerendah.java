/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1DIMENSI;

/**
 *
 * @author HP
 */
public class NilaiTerendah {
      public static void main(String[] args) {
        // Mendefinisikan array
        int[] numbers = {5, 10, 3, 8, 15}; // Ubah nilai sesuai kebutuhan

        // Memanggil method untuk mencari nilai minimum
        int min = findMin(numbers);

        // Menampilkan hasil
        System.out.println("Nilai minimum: " + min);
    }

    // Method untuk mencari nilai minimum dalam array
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

