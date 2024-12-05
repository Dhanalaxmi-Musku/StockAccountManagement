import java.util.Scanner;

public class StockAccountManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();
        System.out.print("Enter the number of stocks in your portfolio: ");
        int numberOfStocks = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfStocks; i++) {
            System.out.println("\nEnter details for Stock #" + (i + 1));
            System.out.print("Enter Stock Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Number of Shares: ");
            int shares = scanner.nextInt();
            System.out.print("Enter Share Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }
        portfolio.printStockReport();
	}
}
