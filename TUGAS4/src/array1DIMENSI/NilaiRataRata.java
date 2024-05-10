/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1DIMENSI;

/**
 *
 * @author HP
 */
public class NilaiRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Mendefinisikan array
        int[] numbers = {5, 10, 3, 8, 15}; // Ubah nilai sesuai kebutuhan

        // Memanggil method untuk mencari nilai rata-rata
        double average = findAverage(numbers);

        // Menampilkan hasil
        System.out.println("Rata-rata: " + average);
    }

    // Method untuk mencari nilai rata-rata dalam array
    public static double findAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
