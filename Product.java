public class Product {
    String name;
    int quantity;
    double price;
    double discount;

    // discount: provide as fractions of 1
    public Product(String name, int quantity, double price, double discount){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    // Calculates item price with discount applied
    // Formula from https://www.mathgoodies.com/lessons/percent/sale_price
    public double salePrice(){
        return (this.price - (this.discount * this.price));
    }
}