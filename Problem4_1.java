import java.util.*;
public class Problem4_1 {
    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle Coperation");
        s1.getPrice(34.35, 34.5);
        System.out.println("Symbol: " + s1.symbol);
        System.out.println("Name: " + s1.name);
        System.out.println("Previous Closing Price: " + s1.previousClosingPrice);
        System.out.println("Current Price: " + s1.currentPrice);
        System.out.println("Price Change: " + s1.getChangePercent());
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    void getPrice(double newPrevious, double newCurrent) {
        previousClosingPrice = newPrevious;
        currentPrice = newCurrent;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }
}