package StockItem;

public class StockItem {
    private String stockNumber;
    private String name;
    private double priceOfItem;
    private int totalStock;
    private double salesTax;


    public StockItem(String stockNumber, String name, double priceOfItem) {
        this.stockNumber = stockNumber;
        this.name = name;
        this.priceOfItem = priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public int getTotalStock() {
        return totalStock;
    }


    public void increaseTotalStock(int addingItem) {
        this.totalStock += addingItem;
    }

    public double calculateTotalPrice() {
        return this.totalStock * this.priceOfItem;
    }
}
