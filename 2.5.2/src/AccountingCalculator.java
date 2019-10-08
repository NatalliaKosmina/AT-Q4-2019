public class AccountingCalculator {
    public static void main(String[] args) {
        Merchandise anyMerch = new Merchandise("Product", "Carrot", 9, 15);
        Merchandise anyMerch1 = new Merchandise("Product1", "Carrot", 17, 15);
        Merchandise anyMerch2 = new Merchandise("Product", "Carrot2", 20, 15);
        Merchandise anyMerch3 = new Merchandise("Product", "Carrot2", 10, 15);

        Stock collectMerch = new Stock();

        collectMerch.addMerch(anyMerch);
        collectMerch.addMerch(anyMerch2);
        collectMerch.addMerch(anyMerch3);
        collectMerch.addMerch(anyMerch1);

        System.out.println("Quantity type: " + collectMerch.getCount());
        System.out.println("Quantity product: " + collectMerch.getProductQuantity());
        System.out.println("Average products price: " + collectMerch.productsAveragePrice());
    }
}
