import java.util.*;
public class Problem4_1 {
    public static void main(String[] args) {
        Stock s1 = new Stock(34.5, 34.35);
        System.out.println("Symbol: " + s1.symbol);
        System.out.println("Name: " + s1.name);
        System.out.println("Previous Closing Price: " + s1.previousClosingPrice);
        System.out.println("Current Price: " + s1.currentPrice);
        System.out.println("Price Change: " + s1.getChangePercent());
    }
}

class Stock {
    String symbol = "ORCL";
    String name = "Oracle Coperation";
    double previousClosingPrice;
    double currentPrice;

    Stock(double newPrevious, double newCurrent) {
        previousClosingPrice = newPrevious;
        currentPrice = newCurrent;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }
}