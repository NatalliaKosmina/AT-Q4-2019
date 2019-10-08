import java.util.ArrayList;

public class Stock {
    private ArrayList<Merchandise> stocktaking = new ArrayList<>();
    private int count = 0;

    public Stock() {
    }

    public void addMerch(Merchandise newMerch) {
        boolean check = false;
        for (Merchandise oneProduct : stocktaking) {
            if (newMerch.getType().equals(oneProduct.getType())) {
                check = true;
                break;
            }
        }
        if (!check) count++;

        stocktaking.add(newMerch);
    }

    public int getCount() {
        return count;
    }

    public int getProductQuantity() {
        int sum = 0;
        for (Merchandise oneProduct : stocktaking) {
            sum += oneProduct.getQuantity();
        }
        return sum;
    }

    public double productsAveragePrice() {
        double averagePrice = 0.0;

        for (Merchandise oneProduct : stocktaking) {
            averagePrice += oneProduct.merchPrice();
        }
        return averagePrice / stocktaking.size();
    }

    public void averagePriceAllProdcuts(){
        double tempPrice = 0;

        for (int i = 0; i<stocktaking.size(); i++){

            for (int y = i+1; y<stocktaking.size(); y++) {
                if (stocktaking.get(i).getType().equals(stocktaking.get(y).getType())) {
                    tempPrice += stocktaking.get(y).getQuantity() * stocktaking.get(y).getPrice();
                }
            }
        }

/*        for (Merchandise anyProduct : stocktaking){
            String tempProductType = stocktaking.get(1).getType();
            int typeCount = 0;
            double
            if(anyProduct.getType().equals(tempProductType)){
                typeCount +
            }
        }*/
    }
}
