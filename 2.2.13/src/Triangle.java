public class Triangle {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            if ((a == 0) | (b == 0) | (c==0)){
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
