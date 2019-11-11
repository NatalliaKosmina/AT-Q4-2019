public class PageNumber {
    public static void main(String[] args) {
        int quantity = 10;
        int numberNews;
        try {
            numberNews = Integer.parseInt(args[0]);
            System.out.println(numberNews + ", pages = " + calcPages(numberNews, quantity));
        } catch (Exception e) {
            System.out.println("Please enter integer number!");
        }
    }

    protected static int calcPages(int a, int quantity) {
        int pages = a / quantity;
        int module = a % 10;
        if (module > 0) {
            return pages += 1;
        }
        return pages;
    }
}