public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        float c = 0;
        c = a/b;
        return c;
/*        try {
            c = a/b;
        } catch (ArithmeticException e){
            System.out.println("It is impossible to divide on 0");
        }
        return c;*/
    }
}