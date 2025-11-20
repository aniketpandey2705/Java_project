public class CartItem {
    String name;
    double unitPrice;     // Price of a single item
    int quantity;         // How many ordered
    double totalPrice;    // unitPrice * quantity

    public CartItem(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = unitPrice * quantity;
    }

    // The "Update" feature logic
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
        this.totalPrice = this.unitPrice * newQuantity;
    }
}