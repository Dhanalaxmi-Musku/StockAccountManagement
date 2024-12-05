import java.util.ArrayList;

public class StockPortfolio {
	private ArrayList<Stock> stocks;
    public StockPortfolio() {
        stocks = new ArrayList<>();
    }
    public void addStock(Stock stock) {
        stocks.add(stock);
    }
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateValue();
        }
        return totalValue;
    }
    public void printStockReport() {
        System.out.println("\n--- STOCK REPORT ---");
        System.out.println("Stock Name          Shares          Price/Share    Total Value");
        System.out.println("----------------------------------------------------");
        
        for (Stock stock : stocks) {
            String stockLine = String.format("%-20s %-15d %-14.2f %-14.2f", 
                               stock.getName(), 
                               stock.getNumberOfShares(), 
                               stock.getSharePrice(), 
                               stock.calculateValue());
            System.out.println(stockLine);
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("Total Portfolio Value: " + String.format("%.2f", calculateTotalValue()));
    }
}
