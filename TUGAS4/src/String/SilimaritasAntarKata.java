/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author HP
 */
public class SilimaritasAntarKata {


    public static void main(String[] args) {
        // Masukkan dua kata yang akan dibandingkan
        String kata1 = "kucing";
        String kata2 = "makanan";

        // Menghitung similaritas antara kata1 dan kata2
        int similarity = calculateSimilarity(kata1, kata2);

        // Menampilkan similaritas
        System.out.println("Similaritas antara kata " + kata1 + " dan " + kata2 + " adalah: " + similarity);
    }

    // Metode untuk menghitung similaritas antara dua kata
    public static int calculateSimilarity(String kata1, String kata2) {
        int[][] similarityMatrix = new int[kata1.length() + 1][kata2.length() + 1];

        // Inisialisasi baris pertama dan kolom pertama dengan nilai 0 hingga panjang kata
        for (int i = 0; i <= kata1.length(); i++) {
            similarityMatrix[i][0] = i;
        }
        for (int j = 0; j <= kata2.length(); j++) {
            similarityMatrix[0][j] = j;
        }

        // Mengisi matriks dengan perhitungan similaritas
        for (int i = 1; i <= kata1.length(); i++) {
            for (int j = 1; j <= kata2.length(); j++) {
                if (kata1.charAt(i - 1) == kata2.charAt(j - 1)) {
                    similarityMatrix[i][j] = similarityMatrix[i - 1][j - 1];
                } else {
                    similarityMatrix[i][j] = 1 + Math.min(similarityMatrix[i - 1][j - 1],
                                                            Math.min(similarityMatrix[i][j - 1],
                                                                     similarityMatrix[i - 1][j]));
                }
            }
        }

        // Mengembalikan nilai similaritas
        return similarityMatrix[kata1.length()][kata2.length()];
    }
}