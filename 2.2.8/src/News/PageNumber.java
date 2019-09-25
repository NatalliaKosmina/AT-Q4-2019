package News;

public class PageNumber {
    public static void main(String[] args) {
        int quantity = 10;
        double numberNews=Double.parseDouble(args[0]);
        System.out.println(calcPages(numberNews, quantity));
    }

    private static int calcPages(double a, int quantity) {
        int pages;
        double b;
        b = a/quantity;
            double module = b%10;
            if (module >0){
                pages = (int)b+1;
                } else {
                pages = (int)b;
            }
        return pages;
    }
}
