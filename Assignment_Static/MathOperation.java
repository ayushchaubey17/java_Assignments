//Write a program to calculate Math operations with Math contents initialized in static block.

public class MathOperation {

    private static double PI;
    private static double E;

    static {
        PI = Math.PI;
        E = Math.E;
    }

    public static void main(String[] args) {
        System.out.println("Mathematical Constants:");
        System.out.println("PI value = " + PI);
        System.out.println("Euler's number (e) value= " + E);
        System.out.println();


        System.out.println("Basic Math Operations:");
        double a = 10.5;
        double b = 5.2;


        double sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " = " + sum);

        double difference = a - b;
        System.out.println("Difference of " + a + " and " + b + " = " + difference);


        double product = a * b;
        System.out.println("Product of " + a + " and " + b + " = " + product);

        double quotient = a / b;
        System.out.println("Quotient of " + a + " and " + b + " = " + quotient);
    }
}
