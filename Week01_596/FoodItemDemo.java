public class FoodItemDemo {
    public static void main(String[] args) {
        FoodItem khichuri = new FoodItem();
        khichuri.name = "Khichuri";
        khichuri.price = 90;
        khichuri.quantity = 12;

        FoodItem tea = new FoodItem();
        tea.name = "Tea";
        tea.price = 15;
        tea.quantity = 40;

        FoodItem samosa = new FoodItem();
        samosa.name = "Samosa";
        samosa.price = 10;
        samosa.quantity = 25;

        khichuri.printLine();
        tea.printLine();
        samosa.printLine();

        int total = khichuri.stockValue() + tea.stockValue() + samosa.stockValue();
        System.out.println("Total stock value: Tk " + total);

        // Optional extension
        tea.sell(5);
        samosa.sell(30);
        tea.printLine();
    }
}
