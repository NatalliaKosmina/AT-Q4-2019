package Circle;

public class CircleArea {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        System.out.println(calcArea(radius));
    }

    public static double calcArea(double r){
        return (Math.PI)*(Math.pow(r, 2));
    }
}
