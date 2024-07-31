import java.util.Scanner;

public class Que3 {

     public static int[][] generateSpiralMatrix(int N) {
        int[][] matrix = new int[N][N];
        int value = 1;
        int top = 0, bottom = N - 1;
        int left = 0, right = N - 1;

        while (top <= bottom && left <= right) {
             for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

              for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size N of the NxN matrix: ");
        int N = scanner.nextInt();

        int[][] spiralMatrix = generateSpiralMatrix(N);

        System.out.println("Spiral matrix:");
        printMatrix(spiralMatrix);
    }
}
