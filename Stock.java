/** **************************************************
 * Program Name: Stocks
 * Programmer's Name: Ryan Jesky
 * Program description: This program uses a GUI to accept stock market input from users, calculates stock losses and profits,
 * displays each stock in a JList, allows the user to save their stocks to a file, or upload previous stocks from a file.
 ********************************************************** */
import java.text.DecimalFormat;

public class Stock{

    private String companyName;
    private double shares;
    private double purchasePrice;
    private double currentPrice;

    public Stock() { //constructor initializing all variable instances
        this.companyName = "unknown";
        this.shares = 0;
        this.purchasePrice = 0;
        this.currentPrice = 0;
    }

    public Stock(String companyName, double shares, double purchasePrice, double currentPrice) {
        this.companyName = companyName;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
        this.currentPrice = currentPrice;
    }

    //behaviors
    public double profitLoss() {
        return shares * (currentPrice - purchasePrice);
    }

    //getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public double getShares() {
        return shares;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double calculate() {
        double calculations = getShares() * (getCurrentPrice() - getPurchasePrice());
        return calculations;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //toString method to allow JList to display correct output
    @Override
    public String toString() {
        DecimalFormat fmtShares = new DecimalFormat("0"); //format shares to look better
        return companyName + ": " + fmtShares.format(shares) + " shares";
    }
}
