public class FoodItem {
    String name;
    int price;      // taka per piece
    int quantity;   // pieces in stock

    int stockValue() {
        return price * quantity;
    }

    void printLine() {
        System.out.println(name + " | Tk " + price + " | Qty " + quantity + " | Value " + stockValue());
    }

    // Optional extension
    void sell(int amount) {
        if (amount > quantity) {
            System.out.println("Not enough " + name + " in stock");
        } else {
            quantity = quantity - amount;
            System.out.println("Sold " + amount + " " + name);
        }
    }
}
