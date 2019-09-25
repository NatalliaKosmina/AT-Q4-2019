package RandomNumber;

public class NumberRandom {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(generatedNumber(number));
        } catch (Exception e) {
            System.out.println("Please enter number!");
        }

    }

    public static int generatedNumber(int a) {
        return (int) (Math.random() * (Math.pow(10, a)));
    }
}
