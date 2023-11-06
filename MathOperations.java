public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));        // Adds two integers
        System.out.println(add(2.5, 3.7));    // Adds two doubles
        System.out.println(add(2, 3.7));      // Adds an integer and a double
    }
}
