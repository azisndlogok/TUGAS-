/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array2Dimensi;

/**
 *
 * @author HP
 */
public class Array2Dimensi {
      public static void main(String[] args) {
        // Mendefinisikan array dua dimensi
        String[][] words = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };

        // Menampilkan array dua dimensi
        System.out.println("Array dua dimensi:");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j] + " ");
            }
            System.out.println();
        }
    }
}
