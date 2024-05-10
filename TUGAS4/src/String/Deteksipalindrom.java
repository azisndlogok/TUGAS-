/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author HP
 */
public class Deteksipalindrom {
     public static void main(String[] args) {
        // Mendefinisikan array dua dimensi
        String[][] words = {
            {"kayak", "level", "radar"},
            {"hello", "world", "java"},
            {"madam", "racecar", "civic"}
        };

        // Memanggil method untuk mendeteksi palindrom
        detectPalindromes(words);
    }

    // Method untuk mendeteksi palindrom dalam array dua dimensi
    public static void detectPalindromes(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (isPalindrome(array[i][j])) {
                    System.out.println("Palindrom ditemukan: " + array[i][j]);
                }
            }
        }
    }

    // Method untuk memeriksa apakah sebuah string adalah palindrom
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
