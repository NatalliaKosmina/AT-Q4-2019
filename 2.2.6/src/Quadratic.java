public class Quadratic {

    public static void main(String[] args) {
        //a*x^2+b*x+c=0
        //D=b^2-4*a*c
        //x1=(-b-sqrt(D))/2*a
        //x2=(-b+sqrt(D))/2*a
        //1 Case: D > 0
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
            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("x1 = " + " " + x1);
                System.out.println("x2 = " + " " + x2);
            } else if (D == 0) {
                x1 = x2 = -b / (2 * a);
                System.out.println("x1 = x2 " + " " + x1);
            } else if (D < 0) {
                System.out.println("The roots of the equation do not exist");
            }
        } catch (Exception e) {
            System.out.println("Please enter number!");
        }


    }
}
