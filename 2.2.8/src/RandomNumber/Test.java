package RandomNumber;

public class Test {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(generatedNumber(number));
    }

    public static int generatedNumber(int a){
        return (int)(Math.random()*(Math.pow(10, a)));
    }
}
