import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args){
        // Our list of products
        Product[] products = {
            new Product("Biscuit", 1, 3.00, 0.0),
            new Product("Mangoes", 2, 1.50, 0.2),
            new Product("Cereal", 1, 2.00, 0.0)
        };

        // Create a new shopping cart with our products
        ShoppingCart cart = new ShoppingCart(products);

        // We use DecimalFormat so we can format it like 0.00
        DecimalFormat moneyFormat = new DecimalFormat("#.00");

        // Show results
        System.out.println("TOTAL: £" + moneyFormat.format(cart.calculateTotal()));
    }
}