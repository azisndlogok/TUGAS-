import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverse(inputArray);
        System.out.print("Array awal: [");
        printArray(inputArray);
        System.out.print("]");
        System.out.println();
        System.out.print("Array terbalik: [");
        printArray(reversedArray);
        System.out.print("]");
    }
    
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
