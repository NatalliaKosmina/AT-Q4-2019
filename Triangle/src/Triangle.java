public class Triangle {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        try {
             a = Double.parseDouble(args[0]);
             b = Double.parseDouble(args[1]);
             c = Double.parseDouble(args[2]);
            boolean isAnyArgusZero = (a == 0) | (b == 0) | (c==0);

            if (isAnyArgusZero){
                System.out.println("A = " + a + ", B = " + b + ", C = " + c + " Triangle does not exist.");
            } else if((a+b>c) & (a+c>b) & (b+c)>a){
                System.out.println("Triangle exists.");
                if((a==b) & (b==c)){
                    System.out.println("A = " + a + ", B = " + b + ", C = " + c + " Triangle is equilateral.");
                } else if ((a==b) | (a==c) | (b==c)){
                    System.out.println("A = " + a + ", B = " + b + ", C = " + c + " Triangle is isosceles.");
                } else {
                    System.out.println("A = " + a + ", B = " + b + ", C = " + c + " Triangle is scalene.");
                }
            } else {
                System.out.println("A = " + a + ", B = " + b + ", C = " + c + " Triangle does not exist.");
            }
        } catch (Exception e) {
            System.out.println("A = " + a + ", B = " + b + ", C = " + c+ " Please enter number!");
        }
    }
}