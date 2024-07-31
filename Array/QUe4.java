import java.util.Scanner;

public class QUe4{

    private static int[][] jaggedArray;

    public static void initializeJaggedArray(int N) {
        jaggedArray = new int[N][];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int numWeights = scanner.nextInt();
            jaggedArray[i] = new int[numWeights];

            System.out.println("Enter the weights for person " + (i + 1) + ":");
            for (int j = 0; j < numWeights; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
    }

    public static void enterWeight(int personIndex, int weightIndex, int weight) {
        if (personIndex < 0 || personIndex >= jaggedArray.length) {
            System.out.println("Invalid person index.");
            return;
        }
        if (weightIndex < 0 || weightIndex >= jaggedArray[personIndex].length) {
            System.out.println("Invalid weight index.");
            return;
        }
        jaggedArray[personIndex][weightIndex] = weight;
        System.out.println("Weight updated successfully.");
    }

    public static void calculateMinimumWeight(int personIndex) {
        if (personIndex < 0 || personIndex >= jaggedArray.length) {
            System.out.println("Invalid person index.");
            return;
        }
        int[] weights = jaggedArray[personIndex];
        if (weights.length == 0) {
            System.out.println("No weights available for person " + (personIndex + 1));
            return;
        }
        int minWeight = weights[0];
        for (int weight : weights) {
            if (weight < minWeight) {
                minWeight = weight;
            }
        }
        System.out.println("The minimum weight of person " + (personIndex + 1) + " is: " + minWeight);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons (N): ");
        int N = scanner.nextInt();

        initializeJaggedArray(N);

        System.out.print("Enter the person index to update weight (0-based): ");
        int personIndex = scanner.nextInt();
        System.out.print("Enter the weight index to update (0-based): ");
        int weightIndex = scanner.nextInt();
        System.out.print("Enter the new weight: ");
        int weight = scanner.nextInt();
        enterWeight(personIndex, weightIndex, weight);

        System.out.print("Enter the person index to find the minimum weight (0-based): ");
        personIndex = scanner.nextInt();
        calculateMinimumWeight(personIndex);
    }
}
