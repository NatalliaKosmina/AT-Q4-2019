public class Quadratic {

    public static void main(String[] args) {
        double D;
        double x1;
        double x2;
        double a;
        double b;
        double c;
        try {
            b = Double.parseDouble(args[1]);
            a = Double.parseDouble(args[0]);
            c = Double.parseDouble(args[2]);
            D = Math.pow(b, 2) - 4 * a * c;
            System.out.println("D = " + " " + D);
            if (D < 0) {
                System.out.println("The roots of the equation do not exist");
                System.exit(-1);
            }
            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("x1 = " + " " + x1);
                System.out.println("x2 = " + " " + x2);
            } else {
                x1 = x2 = -b / (2 * a);
                System.out.println("x1 = x2 " + " " + x1);
            }
        } catch (Exception e) {
            System.out.println("Please enter number!");
        }


    }
}
