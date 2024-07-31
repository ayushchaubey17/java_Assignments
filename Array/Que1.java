import java.util.Scanner;

public class Que1 {

     public static void rotateRight(int[] array, int d) {
        int n = array.length;
        d = d % n;
        if (d == 0) return;

        reverse(array, 0, n - 1);
        reverse(array, 0, d - 1);
        reverse(array, d, n - 1);
    }



    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

         int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

         System.out.print("Enter the number of positions to rotate the array to the right: ");
        int d = scanner.nextInt();

        rotateRight(array, d);

         System.out.println("Rotated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
