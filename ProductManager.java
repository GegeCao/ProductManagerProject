public class ProductManager {
    public static void main(String[] args) {
        System.out.println("Product Manager initialized.");
    }

    // This method calculates a discounted price based on the given percentage
    public double calculateDiscount(double price, double percent) {
        return price - (price * percent / 100);

    }
}
