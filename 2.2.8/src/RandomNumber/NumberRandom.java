package RandomNumber;

public class NumberRandom {
    public static void main(String[] args) {
        if (args[0].length() > 10) {
            System.out.println("Number is too long. Please try another one.");
            System.exit(-1);
        }
        try {
            int number = Integer.parseInt(args[0]);
            if (number<0){
                System.out.println("Incorrect value. Please enter a positive number.");
                System.exit(-1);
            }
            System.out.println(generatedNumber(number));
        } catch (Exception e) {
            System.out.println("Please enter number!");
        }

    }

    public static int generatedNumber(int a) {
        return (int) (Math.random() * (Math.pow(10, a)));
    }
}
