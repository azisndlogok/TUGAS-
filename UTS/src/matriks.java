/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class matriks {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        if (isIdentityMatrix(matrix)) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }

    public static boolean isIdentityMatrix(int[][] matrix) {
        // Memeriksa apakah matriks memiliki ukuran 3x3
        if (matrix.length != 3 || matrix[0].length != 3) {
            return false;
        }

        // Memeriksa elemen diagonal utama (indeks i == j) adalah 1
        for (int i = 0; i < 3; i++) {
            if (matrix[i][i] != 1) {
                return false;
            }
        }

        // Memeriksa elemen di luar diagonal utama adalah 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
} 
