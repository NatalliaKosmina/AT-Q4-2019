public class Triangle {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            boolean isAnyArgusZero = (a == 0) | (b == 0) | (c==0);

            if (isAnyArgusZero){
                System.out.println("Triangle does not exist.");
            } else if((a+b>c) & (a+c>b) & (b+c)>a){
                System.out.println("Triangle exists.");
                if((a==b) & (b==c)){
                    System.out.println("Triangle is equilateral.");
                } else if ((a==b) | (a==c) | (b==c)){
                    System.out.println("Triangle is isosceles.");
                } else {
                    System.out.println("Triangle is scalene.");
                }
            } else {
                System.out.println("Triangle does no exist.");
            }
        } catch (Exception e) {
            System.out.println("Please enter number!");
        }
    }
}
