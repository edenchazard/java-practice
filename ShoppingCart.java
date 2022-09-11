public class ShoppingCart {
    // Here we have an array of Products
    public Product[] products;

    public ShoppingCart(Product[] products){
        this.products = products;
    }

    public double calculateTotal(){
        // our price starts at £0.00 and we add to it as we calculate
        // prices and discounts for each product
        // This isn't an int because it won't be a whole number, and not a float
        // because this decimal has a precision of 2!
        double total = 0.00;

        // Loop through products, adding our sale prices to the total
        for(Product product : products){
            // Add sale price (after discount) to total.
            // Remember to consider quantity!
            total += (product.salePrice() * product.quantity);
        }

        return total;
    }
}