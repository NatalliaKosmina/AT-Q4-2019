public class CircleArea {
    public static void main(String[] args) {
        double radius;
        try {
            radius = Double.parseDouble(args[0]);
            System.out.println("R = " + args[0] + ", S = " + calcArea(radius));
        } catch (Exception e) {
            System.out.println("Not valid value!");
        }
    }

    public static double calcArea(double r) {
        return (Math.PI) * (Math.pow(r, 2));
    }
}
